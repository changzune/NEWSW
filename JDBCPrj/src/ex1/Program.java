package ex1;

import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String sql = "SELECT * FROM NOTICE where hit >10 ";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,"scott","tiger");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		//if(rs.next()) {
		//String title = rs.getString("title");
		//System.out.println(title);
		//}else 
			
		while(rs.next()) {
		int id = rs.getInt("ID");
		String title = rs.getString("title");
		String Writerld = rs.getString("WRITER_ID");
		Date regDate = rs.getDate("REGDATE");
		String content = rs.getString("CONTENT");
		int hit = rs.getInt("hit");

		System.out.printf(" id:%d, title:%s, Writerld:%s, regDate:%s, content:%s, hit:%d\n",
							id, title, Writerld, regDate,content, hit);

		}
			

		rs.close();
		st.close();
		con.close();
		
	}

}
