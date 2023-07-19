/*
 * package com.hcl.main.service;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.hcl.main.model.Login; import
 * com.hcl.main.repository.LoginRepositiory;
 * 
 * @Service public class LoginService {
 * 
 * @Autowired private LoginRepositiory repo;
 * 
 * public Login LoginUser(String tempusername, String temppassword) {
 * System.out.println("Service called");
 * 
 * //Creation of Object of login Login loginobj = null;
 * 
 * //Checking values for tempt variables try {
 * System.out.println("validation called"); if(tempusername!=null &&
 * temppassword!=null) { loginobj=repo.findByUsernameAndPassword(tempusername,
 * temppassword); System.out.println(loginobj.getUsername());
 * System.out.println(loginobj.getPassword()); }
 * 
 * }catch (Exception e) { e.printStackTrace(); throw new
 * NullPointerException("User  "+tempusername+"   was not found in the database"
 * ); } return loginobj; } }
 */