package Model;

public class User {
	int idUser;
	String pass;
	String name;
	String email;
	
      public User() {
		
	}
	
	
	
	public User(int idUser, String pass, String name, String email) {
		super();
		this.idUser = idUser;
		this.pass = pass;
		this.name = name;
		this.email = email;
	}
	
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}

