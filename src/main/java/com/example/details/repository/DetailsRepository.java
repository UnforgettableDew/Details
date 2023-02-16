package com.example.details.repository;

import com.example.details.entity.Details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsRepository extends JpaRepository<Details, Long> {
    Details findByStudentId(Long id);
}
