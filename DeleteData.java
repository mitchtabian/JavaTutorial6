package SQL;

import java.sql.*;
import java.util.Scanner;

public class DeleteData {
	
	static Connection conn = null;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		try{
			String userName = "root";
			String password = "";
			String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
			conn = DriverManager.getConnection(url, userName, password);
			
			System.out.print("Enter the ID of the person you want to remove.");
			int id = scan.nextInt();
			String query = "DELETE FROM test_table WHERE id = " + id;
			Statement stmt = conn.createStatement();
			stmt.execute(query);
			stmt.close();
			conn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}

	}

}
