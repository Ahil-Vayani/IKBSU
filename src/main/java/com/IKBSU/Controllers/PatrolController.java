package com.IKBSU.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.IKBSU.Models.PatrolModel;
import com.IKBSU.Repositories.PatrolRepository;

@RestController
@RequestMapping("/patrols")
public class PatrolController {
	
	@Autowired
	PatrolRepository patrolRepo;
	
	@GetMapping
	public List<PatrolModel> getAllPatrols() {
		return patrolRepo.findAll();
	}
	
	@GetMapping("/{patrolId}")
	public Optional<PatrolModel> getPatrolByName(@PathVariable Integer patrolId) {
		return patrolRepo.findById(patrolId);
	}
	
	@GetMapping("/lastClosed/{lastClosedId}")
	public List<PatrolModel> getPatrolsByLastClosedId(@PathVariable Integer lastClosedId){
		List<PatrolModel> patrols = patrolRepo.findByLastClosed_lastClosedId(lastClosedId);
		return patrols;
	}
	
}
