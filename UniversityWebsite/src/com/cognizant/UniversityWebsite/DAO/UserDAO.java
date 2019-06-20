package com.cognizant.UniversityWebsite.DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cognizant.UniversityWebsite.model.User;
import com.cognizant.UniversityWebsite.util.DbConnector;


public class UserDAO {
                public  User validateUser(String USER_ID,String PASSWORD)
                {
                                Connection conn=null;
                                PreparedStatement st=null;
                                ResultSet rs=null;
                       
                               
                                User u=null;
                                try
                                {
                                                conn=DbConnector.getConnection();
                                                st=conn.prepareStatement("select * from newuser where USER_ID=? and PASSWORD=?");
                                                st.setString(1, USER_ID);
                                                st.setString(2, PASSWORD);
                                                rs=st.executeQuery();
                                                if(rs.next())
                                                {
                                                	u=new User();
                                                	u.setFIRST_NAME(rs.getString(1));
                                                	u.setEMAIL_ID(rs.getString(4));
                                                	u.setMOBILE_NUMBER(rs.getString(5));
                                                	u.setUSER_ID(rs.getString(6));
                                                                
                                                }
                                }
                                catch(Exception e)
                                {
                                                e.printStackTrace();
                                }
                                return u;
                }
                public boolean registerUser(User user)
                {
                                Connection conn=null;
        PreparedStatement st=null;
        int result=0;
        boolean status=false;
        try
        {
            conn=DbConnector.getConnection();
            st=conn.prepareStatement("insert into newuser values(?,?,?,?,?,?,?)");
            st.setString(1, user.getFIRST_NAME());
            st.setString(2, user.getLAST_NAME());
            st.setInt(3, user.getAGE());
            st.setString(4, user.getEMAIL_ID());
            st.setString(5, user.getMOBILE_NUMBER());
            st.setString(6, user.getUSER_ID());
            st.setString(7, user.getPASSWORD());
            
            result=st.executeUpdate();
           if(result>0)
                 status=true;
        }
        catch(Exception e)
       {
            e.printStackTrace();
        }
        return status;

}


}



