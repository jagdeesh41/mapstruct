package com.learning.mappings.mapper;

import com.learning.mappings.dto.CompleteDetailsDTO;
import com.learning.mappings.dto.PersonalDetailsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

/**
 * qualifiedByName can only be used when the field is part of the request send in json
 * And you want to transform the filed to desired transformation
 * here the filed must be part of personalDetailsDTO
 */
@Mapper(componentModel = "spring")
public interface DetailsMapper {
    @Mapping(target = "surName",source = "personalDetailsDTO.lastName")
    @Mapping(target = "noOfTechnologiesKnown",expression = "java(personalDetailsDTO.getTechnologiesKnown().size())")
    @Mapping(target = "status",constant = "Processed MapStruct Successfully")
    @Mapping(target="addressDTO.country",qualifiedByName = "checkCountryIndiaOrNot",source = "personalDetailsDTO.addressDTO.country")
//    @Mapping(target = "readyToVote",expression = "java(canVoteOrNot(personalDetailsDTO.getAge()))")
    @Mapping(target = "readyToVote",expression = "java(personalDetailsDTO.getAge()>18?\"Eligible To Vote\":\"Not Eligible to Vote\")")
    CompleteDetailsDTO convertPersonalToComplete(PersonalDetailsDTO personalDetailsDTO);


    //custom method to do transformations on a specific field in source that is also part of the taget
    //for example country is a part of PersonalDetails as well as a part of CompleteDetails
    //So we can apply transformation on that field
    //here the specific filed in the below default method is country
    @Named("checkCountryIndiaOrNot")
    default String checkCountryIndiaOrNot(String country)
    {
        //here the country is the value that we pass in the json format in the postman (personalDetailsDTO)
        return "INIDA";

    }

    default String canVoteOrNot(Integer currentAge)
    {
        if(currentAge>18)
        {
            return "Can Vote";
        }
        return "Cannot Vote";

    }


}
