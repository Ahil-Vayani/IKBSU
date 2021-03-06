package com.IKBSU.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IKBSU.Models.ScoutModel;
@Repository
public interface ScoutRepository extends JpaRepository<ScoutModel, Integer>{
	
	public List<ScoutModel> findAllScoutsByStatus(String status);
	public ScoutModel findScoutByGrNumber(Integer grNumber);
	
}
