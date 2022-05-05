package com.ruchika.flightreservation.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.springframework.stereotype.Component;

import com.ruchika.flightreservation.pojo.User;

@Component
public class UserDAO extends DAO{

			public UserDAO() {
				System.out.println("*** USER  DAO ****");
				//default constructor
			}
	
			@SuppressWarnings({ "deprecation", "rawtypes" })
			public User findUserByEmail(String email) {
				
		            begin();
		            Query query= getSession().createQuery("from User where email= :email1");
		            query.setParameter("email1",email);
		            User user=(User) query.uniqueResult();
		            close();
		            System.out.println(user);
		            return user; 
		    }
			
			
			public void createUser(User user) {
				begin();
				getSession().save(user);
				commit();
				close();
				
		    }
			
	}

