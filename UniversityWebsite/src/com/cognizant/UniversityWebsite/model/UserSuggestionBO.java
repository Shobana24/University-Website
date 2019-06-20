package com.cognizant.UniversityWebsite.model;

import com.cognizant.UniversityWebsite.DAO.UserSuggestionDAO;

public class UserSuggestionBO {
	public boolean suggestionUser(UserSuggestion u) 
    {
         UserSuggestionDAO usersdao=new UserSuggestionDAO();
         boolean result=usersdao.suggestionUser(u);
         return result;
    }
}
