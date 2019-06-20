package com.cognizant.UniversityWebsite.controlller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.UniversityWebsite.model.*;


public class RegisterController extends HttpServlet {
                private static final long serialVersionUID = 1L;
       
   
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

                protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
                                UserBO ubo=new UserBO();
                                User u=new User();
                                String FIRST_NAME = request.getParameter("First_Name");
                                String LAST_NAME = request.getParameter("Last_Name");
                                int AGE = Integer.parseInt(request.getParameter("Age"));
                                String EMAIL_ID = request.getParameter("Email_Id");
                                String MOBILE_NUMBER = request.getParameter("Mobile_Number");
                                String USER_ID = request.getParameter("User_ID");
                                String PASSWORD = request.getParameter("Password");
                               
                                u.setFIRST_NAME(FIRST_NAME);
                                u.setLAST_NAME(LAST_NAME);
                                u.setAGE(AGE);
                                u.setEMAIL_ID(EMAIL_ID);
                                u.setMOBILE_NUMBER(MOBILE_NUMBER);
                                u.setUSER_ID(USER_ID);
                                u.setPASSWORD(PASSWORD);
                                boolean result=ubo.registerUser(u);
                                RequestDispatcher dispatcher=null;
                                if(result) {
                                                dispatcher=request.getRequestDispatcher("Home.jsp");
                                                
                                                dispatcher.forward(request, response);
                                                
                                }
                                else {
                                                dispatcher=request.getRequestDispatcher("Registration.jsp");
                                                request.setAttribute("msg", "Invalid");
                                                dispatcher.forward(request, response);
                                }
                                
                }

}
