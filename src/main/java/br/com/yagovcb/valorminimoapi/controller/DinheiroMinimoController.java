package br.com.yagovcb.valorminimoapi.controller;

import br.com.yagovcb.valorminimoapi.dto.DinheiroMinimoDTO;
import br.com.yagovcb.valorminimoapi.service.DinheiroMinimoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "/api/dinheirominimo")
public class DinheiroMinimoController {

    @Autowired
    private DinheiroMinimoService dinheiroMinimoService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> dinheiroMinimoPost(@RequestBody DinheiroMinimoDTO dinheiroMinimoDTO){
        log.info("Iniciando o método para saber o mínimo de dinheiro necesário para concluir as transanções");
        return dinheiroMinimoService.dinheiroNecessario(dinheiroMinimoDTO);
    }
}
