/**
 * 
 */
package com.ruchika.flightreservation.controllers;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



import com.ruchika.flightreservation.dao.UserDAO;
import com.ruchika.flightreservation.pojo.Flight;
import com.ruchika.flightreservation.pojo.User;
import com.ruchika.flightreservation.validator.LoginValidator;
import com.ruchika.flightreservation.validator.UserValidator;

/**
 * @author Ruchika Sharma
 *
 */

@Controller
public class UserController {
	
	@Autowired
	private UserDAO userDao;
	
	@Autowired
    private UserValidator validator;
	
	@Autowired
    private LoginValidator loginValidator;

	@RequestMapping("/showReg")
	public  String displayRegistrationPage(ModelMap model,User user) {
		user.setFirstName("Enter your First Name");
		user.setLastName("Enter your last Name");
		user.setEmail("Enter your Email");
		user.setPassword("Enter your password");
		model.addAttribute("user",user);
		return "login/userRegistration";
	}
	
	@RequestMapping(value="/userRegistration",method = RequestMethod.POST)
	public String register(@Valid @ModelAttribute("user") User user,@RequestParam("email") String email,ModelMap modelMap,
			BindingResult result,@RequestParam("password") String password,@RequestParam("confirmPassword") String confirmPassword) {
			
		User svdUser;
		try {
				 svdUser=userDao.findUserByEmail(email);
				 validator.validate(user,result);
					if(email.equals(svdUser.getEmail())){
						modelMap.addAttribute("msg","The email is either already registered with us or left empty!! Proceed to login.");
						return "login/userRegistration";
					}
			}
			catch(NullPointerException e) {
				
				if(!(password.equals(confirmPassword))) {
					modelMap.addAttribute("msg","Password and confirm passwords do not match. Try Again");
					return "login/userRegistration";
				}
			
			}
			if (result.hasErrors()) {       
				 return "login/userRegistration";
			}
			userDao.createUser(user);  // saves the user to db
			modelMap.addAttribute("msg","User Registered successfully !!");
	//	}
		
		
		return "login/login";
	}

	@RequestMapping("/showLogin")
	public String showLoginPage(ModelMap model,User user) {
		
//		user.setEmail("");
//		user.setPassword("");
//		model.addAttribute("user");
		return "login/login";
	}
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String login(User user,@RequestParam("email") String email,@RequestParam("password") String password,
			ModelMap modelMap,BindingResult result) {
	
		//loginValidator.validate(user,result);
		try {
			User svdUser=userDao.findUserByEmail(email);
		
			if(svdUser.getPassword().equals(password) && !(email.equals("admin@gmail.com"))) {
				modelMap.addAttribute("confirmMsg","Login Successful!!");
			
				return "findFlights";
			}
			else if(svdUser.getPassword().equals(password) &&  email.equals("admin@gmail.com")) {
				modelMap.addAttribute("confirmMsg","Login Successful!!");
				return "admin/addFlight";
			}
			else {
				modelMap.addAttribute("msg1","Invalid username or password. Please try again!!");
			}
			}
			catch(NullPointerException n) {
				modelMap.addAttribute("msg","Email Id does not exist !! Please Register first ");
				return "login/login";
			}
			if (result.hasErrors()) {       
				 return "login/login";
			}
		
			return "login/login";
	
	}


}
