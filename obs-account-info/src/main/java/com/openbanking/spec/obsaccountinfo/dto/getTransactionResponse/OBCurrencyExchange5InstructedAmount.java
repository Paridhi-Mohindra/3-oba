package com.openbanking.spec.obsaccountinfo.dto.getTransactionResponse;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OBCurrencyExchange5InstructedAmount {

    @JsonProperty("Amount")
    private String amount = null;

    @JsonProperty("Currency")
    private String currency = null;

}
