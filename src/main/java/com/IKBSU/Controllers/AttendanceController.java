package com.IKBSU.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.IKBSU.Models.AttendanceModel;
import com.IKBSU.Repositories.AttendanceRepository;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {
	
	@Autowired
	AttendanceRepository attendanceRepo;

	@GetMapping
	public List<AttendanceModel> getAllAttendance() {
		return attendanceRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<AttendanceModel> getAttendanceById(@PathVariable Integer id) {
		return attendanceRepo.findById(id);
	}
}
