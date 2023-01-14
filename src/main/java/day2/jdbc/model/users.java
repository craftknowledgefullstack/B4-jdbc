package day2.jdbc.model;

public class users {

	
	private int user_id;
	private String fname;
	private String lname;
	private String role;
	private String address;
	private String email;
	private String phone;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public users(int user_id, String fname, String lname, String role, String address, String email, String phone) {
		super();
		this.user_id = user_id;
		this.fname = fname;
		this.lname = lname;
		this.role = role;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}
	
	public users() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	
	
	
}
