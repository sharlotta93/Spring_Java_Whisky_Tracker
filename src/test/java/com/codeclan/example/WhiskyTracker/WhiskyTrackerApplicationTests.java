package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	WhiskyRepository whiskyRepo;

	@Autowired
	DistilleryRepository distilleryRepo;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canWhiskiesByAge() {
		List<Whisky> result = whiskyRepo.getWhiskyByAge(12);
		assertEquals(2, result.size());
	}

	@Test
	public void getDistilleriesByRegion() {
		List<Distillery> result = distilleryRepo.getDistilleryByRegion("Lowland");
		assertEquals(1, result.size());
	}

//	@Test
//	public void getWhiskyOfSpecificAgeByDistillery() {
//		List<Whisky> result = distilleryRepo.getWhiskyByAge(1L, 12);
//		assertEquals(1, result.size());
//
//	}

}
