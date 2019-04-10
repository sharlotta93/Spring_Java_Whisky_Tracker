package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface DistilleryRepositoryCustom {

    List<Whisky> getWhiskyByAge(Long id, int age);
}
