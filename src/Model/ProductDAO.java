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
	
	
	
	public Product GetId(int id) {
		Product product=new Product();
		String sql="select * from product where idProduct=?";
		try {
			con = cn.ConectionDB();
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			while(rs.next()) {
				product.setIdProduct(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setPrice(rs.getFloat(3));
				product.setStock(rs.getInt(4));
				product.setState(rs.getInt(5));
			}
			
		}catch (Exception e) {
			System.out.println("ERRO AO SELECIONAR PRODUTO NO BANCO DE DADOS");
		}
		
		return product;
	}
	
	
	
	public List SelectAllProduct() {
		String sql="select * from product";
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
			System.out.println("ERRO AO SELECIONAR PRODUTO NO BANCO DE DADOS");
		}
		
		return list;
	}
	

	public int Create(Product p) {
		String sql = "insert into product (name,price,stock,state)values (?,?,?,?)";
		try {
			con = cn.ConectionDB();
			ps = con.prepareStatement(sql);
			ps.setString(1, p.getName());
			ps.setFloat(2, p.getPrice());
			ps.setInt(3, p.getStock());
			ps.setInt(4, p.getState());
			ps.executeUpdate();

		} catch (Exception e) {
			System.out.println("ERRO AO INSERIR PRODUTO NO BANCO DE DADOS");
		}

		return response;
	}

	public int Update(Product p) {

		String sql = "update product set name=?,price=?,stock=?,state=? where idProduct=?";
		try {
			con = cn.ConectionDB();
			ps = con.prepareStatement(sql);
			ps.setString(1, p.getName());
			ps.setFloat(2, p.getPrice());
			ps.setInt(3, p.getStock());
			ps.setInt(4, p.getState());
			ps.setInt(5, p.getIdProduct());
			ps.executeUpdate();
			

		} catch (Exception e) {
			System.out.println("ERRO AO ATUALIZAR PRODUTO NO BANCO DE DADOS");
		}

		return response;
	}

	public void Delete(int id) {
		String sql = "delete from product where idProduct=?";
		try {
			con = cn.ConectionDB();
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (Exception e) {

		}

	}
}