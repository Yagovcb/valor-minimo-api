package br.com.yagovcb.valorminimoapi.service;

import br.com.yagovcb.valorminimoapi.dto.DinheiroMinimoDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.management.BadAttributeValueExpException;
import java.util.regex.Pattern;

@Slf4j
@Service
public class DinheiroMinimoService {

    public ResponseEntity<String> dinheiroNecessario(DinheiroMinimoDTO dinheiroMinimoDTO) {

        log.info("Realizando o método para descobrir o minimo de dinheiro para realizar as transações");

        try {
            int[][] transacoesArray = getArrayDeTransacoes(dinheiroMinimoDTO.getTransacoes());

            int dinheiroAtual = 0, dinheiroMinimo = 0;

            for (int i = 0; i < transacoesArray.length; i++) {
                dinheiroAtual += transacoesArray[i][0];
                dinheiroMinimo = Math.max(dinheiroMinimo, dinheiroAtual);
                dinheiroAtual -= transacoesArray[i][1];
            }
            return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(String.valueOf(dinheiroMinimo));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).contentType(MediaType.APPLICATION_JSON).body(e.getMessage());
        }
    }


    private static int[][] getArrayDeTransacoes(String transacoes) throws BadAttributeValueExpException {
        String str = transacoes;
        str = str.replaceAll("[{} ]", "");
        String[] strArray = str.split(",");

        if (validaArray(strArray)) {
            throw new BadAttributeValueExpException("Você colocou um caracter alfanumerio! Só é permitido caracteres numericos");
        }

        int numElements = strArray.length;
        int numCols = 2;
        int numRows = numElements / numCols;

        int[][] arrayDeTransacoes = new int[numRows][numCols];

        for (int i = 0; i < numElements; i++) {
            arrayDeTransacoes[i / numCols][i % numCols] = Integer.parseInt(strArray[i]);
        }

        return arrayDeTransacoes;
    }


    private static boolean validaArray(String[] array) {
        Pattern pattern = Pattern.compile("^\\d+$");
        for (String s : array) {
            if (!pattern.matcher(s).matches()) {
                return false;
            }
        }
        return true;
    }
}
