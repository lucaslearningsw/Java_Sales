package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Config.ConnectionDB;

public class UserDAO {
	ConnectionDB cn=new ConnectionDB();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	int response;
	
	public User validate(String email, String pass) {
		User user=new User();
		String sql="select * from user where email=? and pass=?";
		try {
			con=cn.ConectionDB();
			ps=con.prepareStatement(sql);
			ps.setString(1,email);
			ps.setString(2, pass);
			rs=ps.executeQuery();
			while(rs.next())
			{
			    user.setIdUser(rs.getInt("idUser"));
				user.setEmail(rs.getString("email"));
				user.setPass(rs.getString("pass"));
				user.setName(rs.getString("name"));
			}
		}catch (Exception e) {
		
		}
		return user;
		
	}
	
	
	// CRUD
	
	public int create (User user) {
		String sql="insert into user ";
		try {
			
		}catch(Exception e)
		{
			
		}
		
		return
	}
	
	public int update (User user)
	{
		return 0;
	}
	
	public void delete(int id)
	{
		
		
	}
	
	

}
