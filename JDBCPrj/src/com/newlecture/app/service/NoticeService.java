package com.newlecture.app.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.newlecture.app.entity.Notice;

//목록을 반환
public class NoticeService {
	
	private String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private String uid ="scott";
	private String pwd ="tiger";
	private String driver = "oracle.jdbc.driver.OracleDriver";
	
	
	public List<Notice> getList() throws ClassNotFoundException, SQLException{
		
		
		String sql = "SELECT * FROM NOTICE";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,uid,pwd);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		//if(rs.next()) {
		//String title = rs.getString("title");
		//System.out.println(title);
		//}else 
			
		List<Notice> list = new ArrayList<Notice>();
		
		while(rs.next()) {
		int id = rs.getInt("ID");
		String title = rs.getString("title");
		String Writerld = rs.getString("WRITER_ID");
		Date regDate = rs.getDate("REGDATE");
		String content = rs.getString("CONTENT");
		int hit = rs.getInt("hit");
		String files = rs.getString("FILES");
		
		
		
		Notice notice = new Notice(
				id,
				title,
				Writerld,
				regDate,
				content,
				hit,
				files
				);
			list.add(notice);

		System.out.printf(" id:%d, title:%s, Writerld:%s, regDate:%s, content:%s, hit:%d\n",
							id, title, Writerld, regDate,content, hit);
		}
		
		
		rs.close();
		st.close();
		con.close();
		
		
		return list;
		
	
		
		
	}

	
	public int insert(Notice notice) throws SQLException, ClassNotFoundException {
		String title= notice.getTitle();
		String writerId = notice.getWriterld();
		String content = notice.getContent();	
		String files = notice.getFiles();
		
		
		String sql = "INSERT INTO NOTICE ( " +
				" title," +
				" writer_id," +
				" content," +
				" files"	+
				") VALUES (?,?,?,?)";
				
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,uid,pwd);
		//Statement st = con.createStatement();
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, title);
		st.setString(2, writerId);
		st.setString(3, content);
		st.setString(4, files);

		
		int result = st.executeUpdate();
		System.out.println(result);
	
		st.close();
		con.close();
		return result;
	}
	
	public int update(Notice notice) throws ClassNotFoundException, SQLException {
	
		String title= notice.getTitle();
		String content = notice.getContent();
		String files = notice.getFiles();
		int id = notice.getId();
		
		
		String sql = " update notice " +
				" set" +
				" title =?," +
				" content= ?," +
				" files=?" +
				"where id =?";
				
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,uid,pwd);
		//Statement st = con.createStatement();
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, title);
		st.setString(2, content);
		st.setString(3, files);
		st.setInt(4, id);

		
		int result = st.executeUpdate();
	
	
		st.close();
		con.close();
		
		return result;
	}
	
	public int delete(int id) throws ClassNotFoundException, SQLException {
		String title="TEST3";
		String content = "hahaha3";
		String files = "";
		
		
		
		
		String sql = "delete notice where id =?";
				
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,uid,pwd);
		//Statement st = con.createStatement();
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, id);

		
		int result = st.executeUpdate();
	
		st.close();
		con.close();
		
		
		return result;
	}
	
	}
	
