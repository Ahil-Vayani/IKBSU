package com.IKBSU.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IKBSU.Models.PatrolModel;

@Repository
public interface PatrolRepository extends JpaRepository<PatrolModel, Integer>{

	List<PatrolModel> findByPatrolName(String name);
}
