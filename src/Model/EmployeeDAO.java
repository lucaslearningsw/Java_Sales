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
	
	public Employee validate(String email, String pass) {
		Employee em=new Employee();
		String sql="select * from employee where email=? and pass=?";
		try {
			con=cn.ConectionDB();
			ps=con.prepareStatement(sql);
			ps.setString(1,email);
			ps.setString(2, pass);
			rs=ps.executeQuery();
			while(rs.next())
			{
				em.setIdEmployee(rs.getInt("idEmployee"));
				em.setEmail(rs.getString("email"));
				em.setPass(rs.getString("pass"));
				em.setName(rs.getString("name"));
			}
		}catch (Exception e) {
		
		}
		return em;
		
	}
	

}
