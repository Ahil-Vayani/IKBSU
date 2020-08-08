package com.IKBSU.Models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "scout")
@Getter @Setter
public class ScoutModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "gr_number")
	private Integer grNumber;
	
	@Column(name = "card_number")
	private Integer cardNumber;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "middle_name")
	private String middleName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "primary_phone_number")
	private String primaryPhoneNuber;

	@Column(name = "secondary_phone_number")
	private String secondaryPhoneNuber;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	
	@Column(name = "place_of_birth")
	private String placeOfBirth;
	
	@Column(name = "nic")
	private String nicNuber;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "rank")
	private String rank;
	
	@Column(name = "qualification")
	private String qualification;
	
	@Column(name = "occupation")
	private String occupation;
	
	@Column(name = "date_of_joining")
	private Date dateOfJoining;
	
	@Column(name = "date_of_leavng")
	private Date dateOfLeaving;
	
}
