package com.learning.mappings.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Data
public class CompleteDetailsDTO {
    private String firstName;
    private String middleName;
    private String surName;
    private LocalDate birthDate;
    private String placeOfBirth;
    private Long phoneNumber;
    private AddressDTO addressDTO;
    private List<String> technologiesKnown;
    private String status;
    private Integer noOfTechnologiesKnown;
    private String readyToVote;


}
