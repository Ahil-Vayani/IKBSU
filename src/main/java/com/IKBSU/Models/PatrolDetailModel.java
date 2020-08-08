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

@Entity(name = "patrol_detail")
@Getter @Setter
public class PatrolDetailModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "patrol_detail_id")
	private Integer patrolDetailId;
	
	@Column(name = "scout_rank")
	private String scoutRank;
	
	@ManyToOne
	@JoinColumn(name = "gr_number") 
	private ScoutModel scout;
}
