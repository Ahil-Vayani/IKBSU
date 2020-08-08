package com.IKBSU.Models;

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

@Entity(name = "patrol")
@Getter @Setter
public class PatrolModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "patrol_id")
	private Integer patrolId;

	@Column(name = "patrol_name")
	private String patrolName;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "patrol_id", referencedColumnName = "patrol_id")
	private List<PatrolDetailModel> patrolDetails;

	@ManyToOne
	@JoinColumn(name = "last_closed_id") 
	private LastClosedModel lastClosed;
}
