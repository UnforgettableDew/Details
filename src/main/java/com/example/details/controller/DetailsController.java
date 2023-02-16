package com.example.details.controller;

import com.example.details.entity.Details;
import com.example.details.service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student-details")
public class DetailsController {
    private final DetailsService detailsService;

    @Autowired
    public DetailsController(DetailsService detailsService) {
        this.detailsService = detailsService;
    }

    @GetMapping(path = "{studentId}")
    public Details getDetails(@PathVariable("studentId") Long studentId){
        return detailsService.getDetails(studentId);
    }

    @PostMapping(path = "/add/{studentId}")
    public void addStudentDetails(@PathVariable("studentId") Long studentId){
        detailsService.addDetailsForStudent(studentId);
    }

    @PostMapping
    public void addDetails(@RequestBody Details details){
        detailsService.addDetails(details);
    }
}
