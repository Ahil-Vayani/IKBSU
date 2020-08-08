package com.IKBSU.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IKBSU.Models.PatrolDetailModel;
@Repository
public interface PatrolDetailRepository extends JpaRepository<PatrolDetailModel, Integer>{

}
