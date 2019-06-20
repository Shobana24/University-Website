package com.cognizant.UniversityWebsite.model;

import com.cognizant.UniversityWebsite.DAO.*;

public class UserBO {
     
          public User validateUser(String USER_ID,String PASSWORD)
          {
               UserDAO userdao=new UserDAO();
              User u=userdao.validateUser(USER_ID, PASSWORD);
               return u;
          }
          public boolean registerUser(User user)
          {
               UserDAO userdao=new UserDAO();
               boolean result=userdao.registerUser(user);
               return result;
          }
      
  }

