package org.reyn.healthfitness.models.dao;

import org.reyn.healthfitness.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("roleRepository")
public interface RoleDAO extends JpaRepository<Role, Integer>{
	Role findByRole(String role);
}

