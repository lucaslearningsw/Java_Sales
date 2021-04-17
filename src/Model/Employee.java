package Model;

public class Employee {
	int idEmployee;
	String pass;
	String name;
	String email;
	
	public Employee() {
		
	}

	public Employee(int idEmployee, String pass, String name, String email) {
		super();
		this.idEmployee = idEmployee;
		this.pass = pass;
		this.name = name;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}

