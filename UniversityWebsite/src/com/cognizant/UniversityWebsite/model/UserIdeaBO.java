package com.cognizant.UniversityWebsite.model;

import com.cognizant.UniversityWebsite.DAO.*;;

public class UserIdeaBO {
	
		public boolean IdeaUser(UserIdea u) 
	    {
	         UserIdeaDAO usersdao=new UserIdeaDAO();
	         boolean result=usersdao.IdeaUser(u);
	         return result;
	    }
}

