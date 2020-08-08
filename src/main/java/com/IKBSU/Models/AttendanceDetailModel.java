package com.IKBSU.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "attendance_detail")
@Getter @Setter
public class AttendanceDetailModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "attendance_detail_id")
	private Integer attendanceDetailId;
	
	@ManyToOne
	@JoinColumn(name = "gr_number") 
	private ScoutModel scout;
}
