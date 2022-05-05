package com.ruchika.flightreservation.validator;



import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.ruchika.flightreservation.pojo.User;

/**
 *
 * @author Ruchika Sharma
 */

@Component
public class LoginValidator implements Validator{

    @Override
    public boolean supports(Class<?> obj) {
        
        //object must be of type UserCommandClass or subclass of 
        //UserCommandClass
        //here we check if our class is matching our commandclass
        // and returns true or false 
       return User.class.isAssignableFrom(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void validate(Object o, Errors errors) {    
        //To change body of generated methods, choose Tools | Templates.
        
    // User user= (User) o;
     User user= (User) o;
     ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "Empty-email","email cannot be empty");
     ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "Empty-password","password cannot be empty");
     if(!(user.getEmail()==null))
         errors.rejectValue("email","email-format-error","Your emailid cannot be empty");
     if(!(user.getPassword()==null))
         errors.rejectValue("email","password-format-error","Your password cannot be empty");
    
    }   

    
//    public boolean validateNormalUser(Object o,Errors errors) {
//    	
//    	 User user= (User) o;
//         ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "Empty-email","email cannot be empty");
//         ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "Empty-password","password cannot be empty");
//         if(!(user.getEmail()==null))
//             errors.rejectValue("email","email-format-error","Your emailid cannot be empty");
//         if(!(user.getPassword()==null))
//             errors.rejectValue("email","password-format-error","Your password cannot be empty");
//         	
//    }
    
}
