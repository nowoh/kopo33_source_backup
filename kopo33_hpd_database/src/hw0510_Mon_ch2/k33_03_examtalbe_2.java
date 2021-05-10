package hw0510_Mon_ch2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class k33_03_examtalbe_2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection k33_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.84:3306/kopo33",                  
				"root" , "kopo33");

		Statement k33_stmt = k33_conn.createStatement(); 
		
		k33_stmt.execute("delete from examtable2;");
		
		k33_stmt.close(); 
		k33_conn.close(); 
	}

}
