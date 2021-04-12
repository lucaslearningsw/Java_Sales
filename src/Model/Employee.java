package Model;

public class Employee {
	int idEmployee;
	String pass;
	String name;
	String phone;
	String state;
	String user;
	
	public Employee() {
		
	}
	
	public Employee(int idEmployee, String pass, String name, String phone, String state, String user) {
		super();
		this.idEmployee = idEmployee;
		this.pass = pass;
		this.name = name;
		this.phone = phone;
		this.state = state;
		this.user = user;
	}

	public int getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

}

