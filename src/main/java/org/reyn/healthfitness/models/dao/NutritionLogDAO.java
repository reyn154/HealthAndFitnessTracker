package org.reyn.healthfitness.models.dao;

import javax.transaction.Transactional;

import org.reyn.healthfitness.models.NutritionalInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface NutritionLogDAO extends CrudRepository<NutritionalInfo, Integer> {
	
	NutritionalInfo findById(Integer id);

}
