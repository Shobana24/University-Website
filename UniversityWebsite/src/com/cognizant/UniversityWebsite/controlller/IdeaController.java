package com.cognizant.UniversityWebsite.controlller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.UniversityWebsite.model.UserIdea;
import com.cognizant.UniversityWebsite.model.UserIdeaBO;




public class IdeaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public IdeaController() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 UserIdeaBO usersbo=new UserIdeaBO();
         UserIdea u=new UserIdea();
		
		String Name=request.getParameter("Name");
        String Email=request.getParameter("Email");
        String Mobile_Number=request.getParameter("Mobile_Number");
        String Idea=request.getParameter("Idea");
        String User_Id=request.getParameter("User_Id");
        
        u.setName(Name);
        u.setEmail(Email);
        u.setMobile_Number(Mobile_Number);
        u.setIdea(Idea);
        u.setUser_Id(User_Id);
        
      
        
        boolean result=usersbo.IdeaUser(u);
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


