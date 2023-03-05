import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Item {
	//method to creat table	
	public void itemTable() {

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
		String sql = ("CREATE TABLE Items(" + "itemId int Primary Key AUTO_INCREMENT,"
	             + " ItemName varchar(50),"
				 + " unitPrice Integer,"
	             + "quantity Integer,"
			   	 + "qtyAmount_price Integer,"
	             +"ShpId Integer REFERENCES Shop(ShopId))");

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
	
	
	
	public static void insertItem() {
		final String url = "jdbc:mysql://localhost:3306/InvoiceSystem";
	  	 Scanner scanner = new Scanner(System.in);
		final String user = "root";
		final String pass = "root";
		Connection conn = null;
		
		System.out.println("How Many Items  You Want To Insert :");
		 int s = scanner.nextInt();
			
		 for(int i=0;i<s;i++) {
				
				 System.out.println("Enter ItemName :");
				 String ItemName = scanner.next();
   			     System.out.println("Enter unitPrice :");
   			     double unitPrice = scanner.nextDouble();
   			     System.out.println("Enter quantity");
   			     int quantity = scanner.nextInt();
   			     System.out.println("Enter qtyAmount_price");
   			     double qtyAmount_price = scanner.nextDouble();
   				System.out.println("Enter ShopName");
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
			String sql = "insert into Items (ItemName,unitPrice,quantity,qtyAmount_price,ShpId)"
					+ "values('"+ItemName+"','" +unitPrice+"','"+quantity+"','"+qtyAmount_price+ "','"
					+ ShId + "')";
			
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
	
//	 method to delete items
	public void deleteById() {
		String url = "jdbc:mysql://localhost:3306/InvoiceSystem";

		// Username and password to access DB
		// Custom initialization
		String user = "root";
		String pass = "root";
		Connection con = null;

		try {
			Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			// Registering drivers
			DriverManager.registerDriver(driver);

			// Reference to connection interface
			con = DriverManager.getConnection(url, user, pass);

			// Creating a statement
			Statement st = con.createStatement();
			Scanner scanner = new Scanner(System.in);

			System.out.println("Number Of Id You Want To Delete ");
			int inputid = scanner.nextInt();
//      int count=1;

			String sql = "delete from Items where itemId ='" + inputid + "'";

			System.out.println(sql);

			try {
				// Executing query
				int m = st.executeUpdate(sql);
				System.out.println("UPDATED SUCCESSFULLY");
			} catch (Exception ex) {
				System.err.println(ex);
			}
			// Closing the connections
			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}

	}
	
//	method to update values by Id
	public void updateById() {
		String url = "jdbc:mysql://localhost:3306/InvoiceSystem";

		// Username and password to access DB
		// Custom initialization
		String user = "root";
		String pass = "root";
		Connection con = null;

		try {
			Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			// Registering drivers
			DriverManager.registerDriver(driver);

			// Reference to connection interface
			con = DriverManager.getConnection(url, user, pass);

			// Creating a statement
			Statement st = con.createStatement();
			Scanner scanner = new Scanner(System.in);

			System.out.println("Number Of Id You Want To Update ");
			int inputid = scanner.nextInt();
//      int count=1;
			System.out.println("change Item Price ");
			String unitPrice = scanner.next();
			
			
			String sql = "UPDATE Items SET unitPrice='" + unitPrice + "' WHERE itemId=" + inputid;
			System.out.println(sql);

			try {
				// Executing query
				int m = st.executeUpdate(sql);
				System.out.println("UPDATED SUCCESSFULLY");
			} catch (Exception ex) {
				System.err.println(ex);
			}
			// Closing the connections
			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}
	
//	method to print
	public static void reportAllItems(){
		final String url = "jdbc:mysql://localhost:3306/InvoiceSystem";
		   final String user = "root";
		   final String pass = "root";
		  
		  
		  
		  String QUERY = "SELECT * FROM Items";
		 
		      Connection conn=null;
		     
		 try {
			 conn = DriverManager.getConnection(url, user, pass);
		 Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	     Statement stmt = conn.createStatement();
	     DriverManager.registerDriver(driver);
	     ResultSet rs=stmt.executeQuery(QUERY);
			 while(rs.next()) {
				int itemId=rs.getInt("itemId");
				String ItemName=rs.getString("ItemName");
				double  unitPrice=rs.getDouble("unitPrice");
				int quantity=rs.getInt("quantity");
				double qtyAmount_price=rs.getDouble("qtyAmount_price");
				
				
				
			     System.out.println("itemId :" + itemId);
			     System.out.println("ItemName :" +ItemName);
			     System.out.println("unitPrice" +unitPrice);
			     System.out.println("quantity" +quantity);
			     System.out.println("qtyAmount_price" +qtyAmount_price);
			     System.out.println("===========================================================");
			  
			 }
			 conn.close() ;
		 }  catch (Exception ex) {
	            System.err.println(ex);
	}
	}
	
}
