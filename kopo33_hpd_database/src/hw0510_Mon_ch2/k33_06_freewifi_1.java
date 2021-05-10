package hw0510_Mon_ch2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class k33_06_freewifi_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection k33_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.84:3306/kopo33",                  
				"root" , "kopo33");

		Statement k33_stmt = k33_conn.createStatement(); 

		k33_stmt.excute( "create table freewifi("+
				"inst_place		varchar(50), "+
				"inst_place_detail	varchar(50), "+
				"inst_city		varcar(50), "+
				"inst_country	varchar(50), "+
				"inst_place_flag	varchar(50), "+
				"service_provider	varchar(50), "+
				"wifi_ssid		varchar(50), "+
				"inst_date		varchhar(50), "+
				"place_addr_road	varchar(50), "+
				)
		
		k33_stmt.close(); 
		k33_conn.close(); 
	}

}
