package hw0510_Mon_ch2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class k33_01_DBTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection k33_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.84:3306/kopo33",                  
				"root" , "kopo33");

		Statement k33_stmt = k33_conn.createStatement(); 
		ResultSet k33_rset = k33_stmt.executeQuery("select * from examtable"); 
		while (k33_rset.next()) { 
			//결과물 처리 
			System.out.println("이름:" + k33_rset.getString(1));
			System.out.println("학번:" + k33_rset.getInt(2));
			System.out.println("국어:" + k33_rset.getInt(3));
			System.out.println("영어:" + k33_rset.getInt(4));
			System.out.println("수학:" + k33_rset.getInt(5));
			System.out.println("===============================");
		} 
		k33_rset.close(); 
		k33_stmt.close(); 
		k33_conn.close(); 

	}

}
