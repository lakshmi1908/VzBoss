package com.hcl.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
       

import com.hcl.main.model.SaveDemand;

public interface SaveDemandRepository extends JpaRepository<SaveDemand, Integer>{

}
