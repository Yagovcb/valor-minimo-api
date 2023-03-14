package br.com.yagovcb.valorminimoapi.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DinheiroMinimoDTO {

    @NonNull
    private String transacoes;
}
