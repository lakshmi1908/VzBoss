package com.hcl.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.hcl.main.model.SaveDemand;
import com.hcl.main.repository.SaveDemandRepository;

@RestController
//@CrossOrigin("http://localhost:8082")

public class SaveDemandController {
	
@Autowired
SaveDemandRepository repo;
	
@PostMapping("/draftbutton")
@ResponseBody
public String saveDate(SaveDemand demanddata) {
	repo.save(demanddata);
	return "draft success";
}
}
