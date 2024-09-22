package com.learning.mappings.controller;

import com.learning.mappings.dto.CompleteDetailsDTO;
import com.learning.mappings.dto.PersonalDetailsDTO;
import com.learning.mappings.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mapper")
public class MapStructController {
    @Autowired
    Service service;
    @GetMapping
    public ResponseEntity<CompleteDetailsDTO> fetchData(@RequestBody PersonalDetailsDTO personalDetailsDTO)
    {
        System.out.println(personalDetailsDTO);
        return ResponseEntity.ok().
                body(service.convertPersonalDetailsToCompleteDetails(personalDetailsDTO));
    }
}
