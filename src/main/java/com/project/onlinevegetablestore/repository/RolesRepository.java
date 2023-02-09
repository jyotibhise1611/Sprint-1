package com.project.onlinevegetablestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.onlinevegetablestore.model.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Long> {

}
