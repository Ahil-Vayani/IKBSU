package com.IKBSU.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.IKBSU.Models.ScoutModel;
import com.IKBSU.Repositories.ScoutRepository;

@RestController
@RequestMapping("/scouts")
public class ScoutController {

	@Autowired
	ScoutRepository scoutRepo;
	
	@GetMapping
	public List<ScoutModel> getAllScouts() {
		return scoutRepo.findAll();
	}
	
	@GetMapping("/active")
	public List<ScoutModel> getAllActiveScouts(){
		return scoutRepo.findAllScoutsByStatus("ACTIVE");
	}
	
	@GetMapping("/{grNumber}")
	public ScoutModel getScoutByGrNumber(@PathVariable Integer grNumber){
		return scoutRepo.findScoutByGrNumber(grNumber);
	}
}
