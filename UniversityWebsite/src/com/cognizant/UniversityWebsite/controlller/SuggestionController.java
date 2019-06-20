package com.cognizant.UniversityWebsite.controlller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.UniversityWebsite.model.*;



public class SuggestionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SuggestionController() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 UserSuggestionBO usersbo=new UserSuggestionBO();
         UserSuggestion u=new UserSuggestion();
		
		String Name=request.getParameter("Name");
        String Email=request.getParameter("Email");
        String Suggestion=request.getParameter("Suggestion");
        String User_Id=request.getParameter("User_Id");
        
        u.setName(Name);
        u.setEmail(Email);
        u.setSuggestion(Suggestion);
        u.setUser_Id(User_Id);
      
        
        boolean result=usersbo.suggestionUser(u);
        RequestDispatcher dispatcher=null;
        if(result) {
                        dispatcher=request.getRequestDispatcher("Success.jsp");
                        dispatcher.forward(request, response);
        }
        else {
                        dispatcher=request.getRequestDispatcher("Login.jsp");
                        request.setAttribute("msg", "Invalid!...");
                        dispatcher.forward(request, response);
        }
        
}
	}


