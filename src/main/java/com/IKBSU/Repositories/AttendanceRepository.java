package com.IKBSU.Repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IKBSU.Models.AttendanceModel;

@Repository
public interface AttendanceRepository extends JpaRepository<AttendanceModel, Integer>{

	public List<AttendanceModel> findAttendanceByAttendanceDateBetween(Date fromDate, Date toDate);
}
