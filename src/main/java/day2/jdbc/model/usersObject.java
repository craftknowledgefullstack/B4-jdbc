package day2.jdbc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class usersObject {

	
	
	public static String driver="com.mysql.cj.jdbc.Driver";
	public static String username="root";
	public static String password="12dbpas";
	public static String url="jdbc:mysql://localhost:3306/fullstack";
	public static Connection con=null;
	
	
	public static void connection() throws ClassNotFoundException, SQLException {
		
		
		Class.forName(driver);
		
		con=DriverManager.getConnection(url, username, password);
		
		
		
	}
	
	
	public static void insert( users users ) throws ClassNotFoundException, SQLException {
		
		connection();
		
		String sql="insert into users (fname,lname,role,address,phone,email) values (?,?,?,?,?,?)";
		
		PreparedStatement st=con.prepareStatement(sql);
		
		
		
		st.setString(1, users.getFname());
		st.setString(2, users.getLname());
		st.setString(3, users.getRole());
		st.setString(4, users.getAddress());
		st.setString(5, users.getPhone());
		st.setString(6, users.getEmail());
		
		int row=st.executeUpdate();
		
		System.out.println(row +" affected");
		
		st.close();
		con.close();
		
		
	}
	
	public static void view() throws ClassNotFoundException, SQLException {
		
		connection();
		
		String sql="select * from users where role=?";
		
	PreparedStatement	st=con.prepareStatement(sql);
		
	   st.setString(1, "users");
	   ResultSet rs= st.executeQuery();
		
	   
	   while(rs.next()) {
		   
		   System.out.println("user is ->" + rs.getInt("user_id"));
		   System.out.println("user f name ->" +rs.getString("fname"));
		   System.out.println("user l name ->" +rs.getString("lname"));
		   
	   }
	   
	   
	st.close();
	con.close();
	   
	   
	}
	
	public static void update() {
		
	}
	
	public static void delete() {
		
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

	
	users usersObj= new users();
	
	
	
	usersObj.setUser_id(2);
	usersObj.setFname("belwe");
	usersObj.setLname("fname");
    usersObj.setAddress("usa");
    usersObj.setEmail("blew@gmail.com");
    usersObj.setPhone("0922323232");
    usersObj.setRole("users");
    
    
 //insert(usersObj);
	
    view();
	
	}

}
