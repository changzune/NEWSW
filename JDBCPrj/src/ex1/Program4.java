package ex1;

import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String title="TEST3";
		String content = "hahaha3";
		String files = "";
		int id = 1;
		
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String sql = "delete notice where id =?";
				
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,"scott","tiger");
		//Statement st = con.createStatement();
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, id);

		
		int result = st.executeUpdate();
		System.out.println(result);
	
		st.close();
		con.close();
		
	}

}
