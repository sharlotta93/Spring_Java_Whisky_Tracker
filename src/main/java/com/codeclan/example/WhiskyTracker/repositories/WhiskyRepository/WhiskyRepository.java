package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WhiskyRepository extends JpaRepository<Whisky, Long>, WhiskyRepositoryCustom {

    // Spring Data JPA Method ("Derived") Query (no body needed)
    List<Whisky> findWhiskysByYear(int year);

    // Custom Criteria query defined in WhiskyRepositoryImpl
    List<Whisky> getAllWhiskiesFromRegion(String region);

    // Spring Data JPA Method ("Derived") Query (no body needed)
    List<Whisky> findWhiskyByDistilleryIdAndAge(Long distilleryId, int age);

}
