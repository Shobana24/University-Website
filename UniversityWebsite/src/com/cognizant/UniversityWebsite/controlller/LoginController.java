package com.cognizant.UniversityWebsite.controlller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cognizant.UniversityWebsite.model.User;
import com.cognizant.UniversityWebsite.model.UserBO;


public class LoginController extends HttpServlet {
                private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException,NullPointerException
{
                                // TODO Auto-generated method stub
                                String userid=request.getParameter("username");
                                String passwd=request.getParameter("password");
                                UserBO userbo=new UserBO();
                               User u=null;
                                HttpSession session=request.getSession();
                                u=userbo.validateUser(userid, passwd);
                                RequestDispatcher dispatcher=null;
                             
                                if(u!=null) {
                                	session.setAttribute("user", u);
                                                dispatcher=request.getRequestDispatcher("Success.jsp");
                                                dispatcher.forward(request, response);
                                }
                                else {
                                                dispatcher=request.getRequestDispatcher("Login.jsp");
                                                request.setAttribute("msg", "Invalid username/password!...");
                                                dispatcher.forward(request, response);
                                }
                                
                }

}

