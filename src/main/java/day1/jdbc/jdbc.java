package day1.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		//Step 1 get the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2 create the connection
		
		String username="root";
		String password="12dbpas";
		String url="jdbc:mysql://localhost:3306/productlisting";
		
	Connection con=	DriverManager.getConnection(url, username, password);
		
	 // Step 3  create createStatement
	
	//Statement st=  con.createStatement();
	
	
	
	String sql = "INSERT INTO product_table (id, pname, powner, pprice) VALUES (?,?,?,?)";
	
  PreparedStatement  st=con.prepareStatement(sql);
  st.setInt(1,6 );
  st.setString(2,"sdsd" );
  st.setString(3,"sdsd" );
  st.setInt(4,1 );

  
  
  //  st.setString(2, "craft");
//  st.setString(3, "some");
//  st.setInt(4,2323 );  
//	
  	
	
	
    int rs=st.executeUpdate();
	
	System.out.println( rs +" affected ");
	
	
	
	st.close();
	con.close();
		
	}

}
