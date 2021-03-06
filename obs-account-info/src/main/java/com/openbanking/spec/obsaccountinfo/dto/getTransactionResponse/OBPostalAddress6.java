package com.openbanking.spec.obsaccountinfo.dto.getTransactionResponse;

import lombok.*;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OBPostalAddress6 {

    @JsonProperty("AddressType")
    private OBAddressTypeCode addressType = null;

    @JsonProperty("Department")
    private String department = null;

    @JsonProperty("SubDepartment")
    private String subDepartment = null;

    @JsonProperty("StreetName")
    private String streetName = null;

    @JsonProperty("BuildingNumber")
    private String buildingNumber = null;

    @JsonProperty("PostCode")
    private String postCode = null;

    @JsonProperty("TownName")
    private String townName = null;

    @JsonProperty("CountrySubDivision")
    private String countrySubDivision = null;

    @JsonProperty("Country")
    private String country = null;

    @JsonProperty("AddressLine")
    private List<String> addressLine = null;

}
