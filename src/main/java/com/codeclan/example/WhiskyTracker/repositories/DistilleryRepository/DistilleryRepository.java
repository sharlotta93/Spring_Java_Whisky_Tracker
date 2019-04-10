package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistilleryRepository extends JpaRepository<Distillery, Long>, DistilleryRepositoryCustom {
    List<Distillery> getDistilleryByRegion(String region);

    List<Whisky> getWhiskyByAge(Long id, int age);
//    List<Whisky> getWhiskyByRegion(String region);
}
