package hw0510_Mon_ch2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class k33_05_examtalbe_4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection k33_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.84:3306/kopo33",                  
				"root" , "kopo33");

		Statement k33_stmt = k33_conn.createStatement(); 
		ResultSet k33_rset = k33_stmt.executeQuery("select * from examtable2"); 

		System.out.printf("  이름   학번   국어 영어 수학\n");
		while (k33_rset.next()) { 
			System.out.printf("%4s  %6d  %3d  %3d  %3d \n",
					k33_rset.getString(1), k33_rset.getInt(2), k33_rset.getInt(3), k33_rset.getInt(4), k33_rset.getInt(5));
		} 
		k33_rset.close(); 
		k33_stmt.close(); 
		k33_conn.close(); 
	}

}
