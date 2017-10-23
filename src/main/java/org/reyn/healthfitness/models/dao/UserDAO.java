package org.reyn.healthfitness.models.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.reyn.healthfitness.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface UserDAO extends CrudRepository<User, Integer> {
	
	public List<User> findAll();
	
	public User findById(Integer id);
	
}
