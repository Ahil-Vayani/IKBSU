package com.IKBSU.Controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.IKBSU.Models.AttendanceModel;
import com.IKBSU.Models.AttendanceTypeModel;
import com.IKBSU.Repositories.AttendanceRepository;
import com.IKBSU.Repositories.AttendanceTypeRepository;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {
	
	@Autowired
	AttendanceRepository attendanceRepo;

	@Autowired
	AttendanceTypeRepository attendanceTypeRepo;
	
	@GetMapping
	public List<AttendanceModel> getAllAttendance() {
		return attendanceRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<AttendanceModel> getAttendanceById(@PathVariable Integer id) {
		return attendanceRepo.findById(id);
	}
	
	@GetMapping("/attendanceTypes")
	public List<AttendanceTypeModel> getAttendanceTypes() {
		return attendanceTypeRepo.findAll();
	}
	
	@GetMapping("/{fromDateStr}/{toDateStr}")
	public List<AttendanceModel> getAttendanceByDatesBetween(@PathVariable String fromDateStr, @PathVariable String toDateStr){
		Date fromDate = null, toDate = null;
		try {
			fromDate = new SimpleDateFormat("yyyy-MM-DD").parse(fromDateStr);
			toDate = new SimpleDateFormat("yyyy-MM-DD").parse(toDateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return attendanceRepo.findAttendanceByAttendanceDateBetween(fromDate, toDate);
	}
}
