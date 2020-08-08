package com.IKBSU.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "attendance_type")
@Getter @Setter
public class AttendanceTypeModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "attendance_type_id")
	private Integer attendanceTypeId;
	
	@Column(name = "attendance_type_name")
	private String attendanceTypeName;
	
	@Column(name = "category")
	private String category;
}
