

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class db_connect {

	public static Connection getConnection() throws Exception{
		try{
		String Driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/adatabas";
		String username="root";
		String password="";
		
		Class.forName(Driver);
		Connection conn=DriverManager.getConnection(url,username,password);
		return conn;
		}catch(Exception e){
			
		}
		
		return null;
	}
	
}
