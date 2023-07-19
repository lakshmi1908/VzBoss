package com.hcl.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.main.model.SaveDemand;
import com.hcl.main.model.SubmitDemand;
import com.hcl.main.repository.SaveDemandRepository;
import com.hcl.main.repository.SubmitDemandRepository;


@RestController
public class SubmitDemandController {

	
	
	//@CrossOrigin("http://localhost:8082")

	
		
	@Autowired
	SubmitDemandRepository submitrepo;
		
	@PostMapping("/submitbutton")
	@ResponseBody
	public String saveData(SubmitDemand submitdemanddata) {
		submitrepo.save(submitdemanddata);
		return "submit success";
	}
	}

