package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
	public String registerUser(User user) throws ClassNotFoundException {
		Connection con = DbConnection.getConn();
		String sql = "insert into registeredusers(name,email,userName,password) values (?,?,?,?) ";
		int i=0;
		try {
		      PreparedStatement preparedStatement = con.prepareStatement(sql);
		      preparedStatement.setString(1, user.getName());
		      preparedStatement.setString(2, user.geteMail());
		      preparedStatement.setString(3, user.getUserName());
		      preparedStatement.setString(4, user.getPasword());
		      i = preparedStatement.executeUpdate();
		    } catch (SQLException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		    }
		    if (i != 0) {
		      return "User is registered";
		    } else {
		      return "Error!!!!";
		    }
	}
	
	public boolean signInUser(SignInUser user) throws ClassNotFoundException {
		boolean result = false;
		Connection con = DbConnection.getConn();
		String sql="select * from registeredusers where email=? and password=?";
		try {
		      PreparedStatement ps=con.prepareStatement(sql);
		      ps.setString(1, user.getEmail());
		      ps.setString(2, user.getPassward());
		      ResultSet rs=ps.executeQuery();
		      result=rs.next();
		    } catch (SQLException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		    }    
		    return result;
	}

}
