package org.reyn.healthfitness.services;

import org.reyn.healthfitness.models.NutritionalInfo;
import org.reyn.healthfitness.models.dao.NutritionLogDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NutritionLogService {

	@Autowired
	private NutritionLogDAO nutritionLogDAO;
	
	public void save(NutritionalInfo info) {
		nutritionLogDAO.save(info);
	}
	
}
