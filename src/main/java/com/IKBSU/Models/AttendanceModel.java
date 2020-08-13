package com.IKBSU.Models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "attendance")
@Getter @Setter
public class AttendanceModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "attendance_id")
	private Integer attendanceId;
	
	@Column(name = "attendance_date")
	private Date attendanceDate;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "attendance_id", referencedColumnName = "attendance_id")
	private List<AttendanceDetailModel> attendanceDetails;
	
	@ManyToOne
	@JoinColumn(name = "attendance_type_id") 
	private AttendanceTypeModel attendanceType;
}
