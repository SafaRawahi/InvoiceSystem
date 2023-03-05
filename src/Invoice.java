import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class Invoice {
	
//method to creat table	

	public void invoiceTable() {

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
		String sql = ("CREATE TABLE Invoice (" + "InvoiceId int Primary Key AUTO_INCREMENT,"
				+ " customerFullName varchar(225),"+ " phoneNumber varchar(225),"  + " invoiceDate date," + "numberOfItems Integer,"
				+ "totalAmount Integer," + "paidAmount Integer," + "balance Integer,"
				+ "itmId int REFERENCES Items(itemId))");

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
	
	
	//method to insert value in table
	
	public static void insertValue(){
		final String url = "jdbc:mysql://localhost:3306/InvoiceSystem";
		Scanner scanner = new Scanner(System.in);
		final String user = "root";
		final String pass = "root";
		Connection conn = null;
		System.out.println("Enter Number Of Invoice You Want To Insert:");
		int s = scanner.nextInt();
		for (int i = 0; i < s; i++) {
//		
			System.out.println("Enter customerFullName :");
			String customerFullName = scanner.next();
			
			System.out.println("Enter  phoneNumber");
			String phoneNumber = scanner.next();
			
			Date invoiceDate = new Date(System.currentTimeMillis());
			System.out.println("Enter numberOfItems");
			int numberOfItems = scanner.nextInt();
			
//			Date invoiceDate = new Date(System.currentTimeMillis());
			
			System.out.println("Enter totalAmount");
			int totalAmount = scanner.nextInt();
			
			System.out.println("Enter paidAmount");
			int paidAmount =  scanner.nextInt();
			
			System.out.println("Enter balance");
			int balance = scanner.nextInt();
			
			
			System.out.println("Enter item name");
			String ItemName = scanner.next();
			
				String QUERY = "SELECT itemId FROM Items where ItemName='" + ItemName+"'";
			
			try {
				Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				DriverManager.registerDriver(driver);
				conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement();
				
				
				int tmId=0;
				ResultSet rs = stmt.executeQuery(QUERY);
				while(rs.next()) {
					tmId = rs.getInt("itemId");
					System.out.println(tmId);
				}
				String sql = "insert into Invoice (customerFullName,phoneNumber,invoiceDate,numberOfItems,totalAmount,paidAmount,balance,itmId)" + "values('"
						+ customerFullName+ "','" + phoneNumber + "','" + invoiceDate + "','" + numberOfItems + "','" + totalAmount + "','"
						+ paidAmount + "','" + balance +"','" + tmId+"')";
				
				
				int m = stmt.executeUpdate(sql);
				if (m >= 0) {
					System.out.println("inserted in given database...");
				} else {
					System.out.println("failed");
				}
				conn.close();
			} catch (Exception ex) {
				System.err.println(ex);
			}
		}
	
	
	
	}}
