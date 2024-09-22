package com.learning.mappings.service;

import com.learning.mappings.dto.CompleteDetailsDTO;
import com.learning.mappings.dto.PersonalDetailsDTO;
import com.learning.mappings.mapper.DetailsMapper;
import org.springframework.beans.factory.annotation.Autowired;
@org.springframework.stereotype.Service
public class Service {
    @Autowired
    DetailsMapper detailsMapper;


    public CompleteDetailsDTO convertPersonalDetailsToCompleteDetails(PersonalDetailsDTO personalDetailsDTO)
    {
        System.out.println(personalDetailsDTO.getTechnologiesKnown());
        System.out.println(personalDetailsDTO.getAddressDTO());
        return detailsMapper.convertPersonalToComplete(personalDetailsDTO);
    }
}
