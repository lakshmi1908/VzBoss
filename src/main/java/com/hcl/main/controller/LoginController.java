/*
 * package com.hcl.main.controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.CrossOrigin; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.hcl.main.model.Login; import com.hcl.main.service.LoginService;
 * 
 * @RestController
 * 
 * @CrossOrigin("http://localhost:3000")
 * 
 * @RequestMapping("/") public class LoginController {
 * 
 * @Autowired private LoginService service;
 * 
 * @PostMapping("/login") //@CrossOrigin("http://localhost:3000") public Login
 * UserLogin(@RequestBody Login login) throws Exception {
 * System.out.println("Login Called"); //Transferring fronted data to tempt
 * variable String tempusername=login.getUsername(); String
 * temppassword=login.getPassword(); Login log=null;
 * log=service.LoginUser(tempusername, temppassword); return log; } }
 */