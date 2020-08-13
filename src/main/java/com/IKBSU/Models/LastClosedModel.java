package com.IKBSU.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "last_closed")
@Getter @Setter
public class LastClosedModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer lastClosedId;
	
	@Column(name = "created_on")
	private Date createdOn;

	@Column(name = "closed_on")
	private Date closedOn;
}
