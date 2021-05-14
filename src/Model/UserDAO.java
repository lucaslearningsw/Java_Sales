package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Config.ConnectionDB;

public class UserDAO {
	ConnectionDB cn = new ConnectionDB();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	int response;

	public User validate(String email, String pass) {
		User user = new User();
		String sql = "select * from user where email=? and pass=?";
		try {
			con = cn.ConectionDB();
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			while (rs.next()) {
				user.setIdUser(rs.getInt("idUser"));
				user.setEmail(rs.getString("email"));
				user.setPass(rs.getString("pass"));
				user.setName(rs.getString("name"));
			}
		} catch (Exception e) {

		}
		return user;

	}

	public User GetEmail(String email) {
		User user = new User();
		String sql = "select * from user where email=" + email;
		try {
			con = cn.ConectionDB();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				user.setEmail(rs.getString(4));
				user.setName(rs.getString(3));
				user.setPass(rs.getString(2));
			}
		} catch (Exception e) {

		}

		return user;
	}

	public boolean Email_Registered(String email) {
		User user = new User();
		String sql = "select * from user where email=?";
		try {
			con = cn.ConectionDB();
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			rs = ps.executeQuery();
			while (rs.next()) {
				user.setEmail(rs.getString(4));

			}
		} catch (Exception e) {

		}

		boolean r;
		if (user.getEmail() == null) {
			r = false;
		} else
			r = true;

		return r;
	}

	// CRUD

	public int create(User user) {
		String sql = "insert into user(email,name,pass)values (?,?,?)";
		try {
			con = cn.ConectionDB();
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getEmail());
			ps.setString(2, user.getName());
			ps.setString(3, user.getPass());
			ps.executeUpdate();

		} catch (Exception e) {

		}

		return response;
	}

	public int update(User user) {

		String sql = "update user set email?,name?,pass? where idUser=?";
		try {
			con = cn.ConectionDB();
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getEmail());
			ps.setString(2, user.getName());
			ps.setString(3, user.getPass());
			ps.setInt(4, user.getIdUser());
			ps.executeUpdate();

		} catch (Exception e) {

		}

		return response;
	}

	public void delete(String email) {
		String sql = "delete from user where email=?";
		try {
			con = cn.ConectionDB();
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ps.executeUpdate();

		} catch (Exception e) {

		}

	}

}
