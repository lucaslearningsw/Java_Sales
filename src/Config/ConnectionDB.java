package Config;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
	
	Connection con;
	String url="jdbc:mysql://aa10ek5m2lypqkr.cqsgdsytwmq5.sa-east-1.rds.amazonaws.com:3306/sales_db";
	String user="root";
	String pass="sales_dev_uninove";
	public Connection ConectionDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,user,pass);
			
		} catch (Exception e)
		{
			 System.out.println("NÃO FOI POSSÍVEL CONECTAR COM O BANCO DE DADOS");
		}
		return con;
	}

}
