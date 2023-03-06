import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Shop {
	//method to creat table	
	public void shopTable() {

		// Java Program to Establish Connection in JDBC

		// Main class

		// Main driver method

		// Creating the connection using Oracle DB
		// Note: url syntax is standard, so do grasp
		String url = "jdbc:mysql://localhost:3306/InvoiceSystem";

		// Username and password to access DB
		// Custom initialization
		String user = "root";
		String pass = "root";

		// Entering the data
		Scanner scanner = new Scanner(System.in);
		String sql = ("CREATE TABLE Shop (" + "ShopId int Primary Key AUTO_INCREMENT,"
				+ "ShopName varchar(50))");

		// Connection class object
		Connection con = null;

		// Try block to check for exceptions
		try {

			Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			// Registering drivers
			DriverManager.registerDriver(driver);

			// Reference to connection interface
			con = DriverManager.getConnection(url, user, pass);

			// Creating a statement
			Statement st = con.createStatement();

			// Executing query
			int m = st.executeUpdate(sql);
			if (m >= 0)
				System.out.println("inserted successfully : " + sql);
			else
				System.out.println("insertion failed");

			// Closing the connections
			con.close();
		}

		// Catch block to handle exceptions
		catch (Exception ex) {
			// Display message when exceptions occurs
			System.err.println(ex);
		}
	}
	
	
	public static void insertShopName() {
		final String url = "jdbc:mysql://localhost:3306/InvoiceSystem";
	  	 Scanner scanner = new Scanner(System.in);
		final String user = "root";
		final String pass = "root";
		Connection conn = null;
		
		System.out.println("How Many Shop You Want To Insert :");
		 int s = scanner.nextInt();
			
		 for(int i=0;i<s;i++) {
				
				 System.out.println("Enter ShopName :");
				 String ShopName = scanner.next();
   			   
				
   				String QUERY = "SELECT ShopId FROM Shop where ShopName='" + ShopName+"'";
			
			try {
			
			Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url, user, pass);
			Statement stmt = conn.createStatement();
			
			int ShId=0;
			ResultSet rs = stmt.executeQuery(QUERY);
			while(rs.next()) {
				ShId = rs.getInt("ShopId");
			}
			System.out.println(ShId);
			String sql = "insert into Shop (ShopName)"
					+ "values('"+ShopName+ "')";
			
			int m = stmt.executeUpdate(sql);
			if (m >= 0)
				{System.out.println("inserted in given database...");
				}
			else {
				System.out.println("failed");
			}
			
			conn.close();
			
		}catch (Exception ex) {
			System.err.println(ex);
		}
		}
	
	}
}
