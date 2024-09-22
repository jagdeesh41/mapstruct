package com.learning.mappings.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AddressDTO {
    private String city;
    private String state;
    private String country;
    private Long pinCode;

}
