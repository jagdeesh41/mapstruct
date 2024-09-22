package com.learning.mappings.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;
@Data
@ToString
public class PersonalDetailsDTO {
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("MiddleName")
    private String middleName;
    @JsonProperty("LastName")
    private String lastName;
    @JsonProperty("Age")
    private Integer age;
    @JsonProperty("BirthDate")
    private LocalDate birthDate;
    @JsonProperty("PlaceOfBirth")
    private String placeOfBirth;
    @JsonProperty("AddressDTO")
    private AddressDTO addressDTO;
    @JsonProperty("PhoneNumber")
    private Long phoneNumber;
    @JsonProperty("TechnologiesKnown")
    private List<String> technologiesKnown;



}
