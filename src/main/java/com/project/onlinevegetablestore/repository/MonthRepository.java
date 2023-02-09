package com.project.onlinevegetablestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.onlinevegetablestore.model.Month;

@Repository
public interface MonthRepository extends JpaRepository<Month, Long> {

}
