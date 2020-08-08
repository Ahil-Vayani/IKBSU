package com.IKBSU.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IKBSU.Models.AttendanceModel;

@Repository
public interface AttendanceRepository extends JpaRepository<AttendanceModel, Integer>{

}
