package Config;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
	
	Connection con;
	String url="jdbc:mysql://localhost:3306/javasales_db";
	String user="root";
	String pass="sales_dev_uninove";
	public Connection ConectionDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,user,pass);
			
		} catch (Exception e)
		{
			
		}
		return con;
	}

}
