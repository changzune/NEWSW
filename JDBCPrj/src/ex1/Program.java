package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.15:1521/xepdb1";,"scott","tiger");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		rs.close();
		st.close();
		con.close();
		

	}

}
