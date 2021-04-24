package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Config.ConnectionDB;

public class ProductDAO {

	ConnectionDB cn = new ConnectionDB();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	int response;

//CRUD
	
	
	public List AllProduct() {
		String sql="select * from p";
		List<Product>list=new ArrayList<>();
		try {
			con = cn.ConectionDB();
			ps = con.prepareStatement(sql);
			rs=ps.executeQuery();
			while (rs.next())
			{
				Product product =new Product();
				product.setIdProduct(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setPrice(rs.getFloat(3));
				product.setStock(rs.getInt(4));
				product.setState(rs.getInt(5));
				list.add(product);
				
			}
		}catch (Exception e)
		{
			
		}
		
		return list;
	}
	

	public int Create(Product p) {
		String sql = "insert into p(name,price,stock,state)values (?,?,?,?)";
		try {
			con = cn.ConectionDB();
			ps = con.prepareStatement(sql);
			ps.setString(1, p.getName());
			ps.setFloat(2, p.getPrice());
			ps.setInt(3, p.getStock());
			ps.setInt(4, p.getState());
			ps.executeUpdate();

		} catch (Exception e) {

		}

		return response;
	}

	public int Update(Product p) {

		String sql = "update p set name?,price?,stock?,state? where idp=?";
		try {
			con = cn.ConectionDB();
			ps = con.prepareStatement(sql);
			ps.setString(1, p.getName());
			ps.setFloat(2, p.getPrice());
			ps.setInt(3, p.getStock());
			ps.setInt(4, p.getState());
			ps.executeUpdate();
			

		} catch (Exception e) {

		}

		return response;
	}

	public void Delete(int id) {
		String sql = "delete from p where idp=?";
		try {
			con = cn.ConectionDB();
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (Exception e) {

		}

	}
}