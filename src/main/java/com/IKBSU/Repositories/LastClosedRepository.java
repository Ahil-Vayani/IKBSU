package com.IKBSU.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IKBSU.Models.LastClosedModel;

@Repository
public interface LastClosedRepository extends JpaRepository<LastClosedModel, Integer>{

}
