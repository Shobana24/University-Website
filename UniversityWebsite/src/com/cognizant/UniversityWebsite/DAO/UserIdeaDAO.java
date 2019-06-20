package com.cognizant.UniversityWebsite.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.cognizant.UniversityWebsite.model.*;
import com.cognizant.UniversityWebsite.util.DbConnector;

public class UserIdeaDAO {

	public boolean IdeaUser(UserIdea u)  
    {
                    Connection conn=null;
                    PreparedStatement st=null;
                    int result=0;
                    boolean status=false;
try
{
conn=DbConnector.getConnection();
st=conn.prepareStatement("insert into idea values(?,?,?,?,?)");

st.setString(1, u.getName());
st.setString(2, u.getEmail());
st.setString(3, u.getMobile_Number());
st.setString(4, u.getIdea());
st.setString(5, u.getUser_Id());

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


