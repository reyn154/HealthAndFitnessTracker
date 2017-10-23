package org.reyn.healthfitness.fitnessCalculations;

import org.springframework.stereotype.Service;

@Service
public class FitnessService {
	
	private Fitness userFitness = new Fitness(85.5, 1.75, "M", 23, 170, 90);
	
	public Fitness getFitnessValues() {
		return userFitness;
	}
	
}
