package com.example.details.service;

import com.example.details.entity.Details;
import com.example.details.repository.DetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.Supplier;

@Service
public class DetailsService {
    private final DetailsRepository detailsRepository;

    @Autowired
    public DetailsService(DetailsRepository detailsRepository) {
        this.detailsRepository = detailsRepository;
    }

    public void addDetailsForStudent(Long studentId){
        Details details = new Details(studentId,
                (int)(Math.random()*30+1),
                (float)Math.random()*100+100,
                "FICT");
        detailsRepository.save(details);
    }

    public void addDetails(Details details){
        detailsRepository.save(details);
    }

    public Details getDetails(Long studentId){
        return detailsRepository.findByStudentId(studentId);
    }
}
