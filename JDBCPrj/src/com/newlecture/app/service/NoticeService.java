package com.newlecture.app.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.List;


import com.newlecture.app.entity.Notice;

//목록을 반환
public class NoticeService {
	public List<Notice> getList(){
		
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
		
		Notice notice = new Notice(
				id,
				title,
				Writerld,
				regDate,
				content,
				hit
				
				);
		

		System.out.printf(" id:%d, title:%s, Writerld:%s, regDate:%s, content:%s, hit:%d\n",
							id, title, Writerld, regDate,content, hit);
		
		return ?;
		
	}
	
}
