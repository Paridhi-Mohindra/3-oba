package com.openbanking.spec.obspaymentinitiation.dto.internal.domesticPayments.response;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OBActiveOrHistoricCurrencyAndAmount {

    @JsonProperty("Amount")
    private String amount = null;

    @JsonProperty("Currency")
    private String currency = null;

}
