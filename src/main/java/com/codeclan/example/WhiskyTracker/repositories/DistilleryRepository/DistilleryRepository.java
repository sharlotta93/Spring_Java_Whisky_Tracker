package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistilleryRepository extends JpaRepository<Distillery, Long>, DistilleryRepositoryCustom {
    // Spring Data JPA Method ("Derived") Query (no body needed)
    List<Distillery> findDistilleriesByRegion(String region);

    // Custom Criteria query defined in DistilleryRepositoryImpl
    List<Distillery> getDistilleriesForWhiskiesAged(int age);
}
