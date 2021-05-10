package hw0510_Mon_ch2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class k33_04_examtalbe_3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection k33_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.84:3306/kopo33",                  
				"root" , "kopo33");

		Statement k33_stmt = k33_conn.createStatement(); 
		
		k33_stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values ('ȿ��', 209901, 95,100,95);");
		k33_stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values ('����', 209902, 90,90,80);");
		k33_stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values ('����', 209903, 95,100,100);");
		k33_stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values ('����', 209904, 90,80,85);");
		k33_stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values ('�ҿ�', 209905, 90,80,90);");
		k33_stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values ('ť��', 209906, 75,85,95);");
		k33_stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values ('ȭ��', 209907, 75,90,95);");
		
		k33_stmt.close(); 
		k33_conn.close(); 
	}

}
