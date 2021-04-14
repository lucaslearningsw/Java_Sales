package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Config.ConnectionDB;

public class EmployeeDAO {
	ConnectionDB cn=new ConnectionDB();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public Employee validate(String user, String pass) {
		Employee em=new Employee();
		String sql="select * from employee where user=? and pass=?";
		try {
			con=cn.ConectionDB();
			ps=con.prepareStatement(sql);
			ps.setString(1,user);
			ps.setString(2, pass);
			rs=ps.executeQuery();
			while(rs.next())
			{
				em.setIdEmployee(rs.getInt("idEmployee"));
				em.setUser(rs.getString("user"));
				em.setPass(rs.getString("pass"));
				em.setName(rs.getString("name"));
			}
		}catch (Exception e) {
		
		}
		return em;
		
	}
	

}
