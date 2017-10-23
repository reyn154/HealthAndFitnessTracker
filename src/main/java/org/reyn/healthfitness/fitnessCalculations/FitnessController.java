package org.reyn.healthfitness.fitnessCalculations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FitnessController {
	
	@Autowired
	private FitnessService fitnessService;
	
	@RequestMapping("/fitness")
	public Fitness getAllTopics() {
		return fitnessService.getFitnessValues();
	}
}
