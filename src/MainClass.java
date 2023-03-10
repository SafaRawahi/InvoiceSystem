import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;



public class MainClass {
	

	static void mainMenue() {

		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t \t ********** Welcome *********** \t \t");
		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t \t ***Please Choose One Option*** \t \t");
		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t\t 1. Create Invoice Table  ");
		System.out.println("\t\t 2. Create Item Table  ");
		System.out.println("\t\t 3. Create Invoice Header Table  ");
		System.out.println("\t\t 4. Create Shop Table  ");
		System.out.println("\t\t 5. Shop Setting Menue   ");
		System.out.println("\t\t 6. Manage Shop Items Menue   ");
		System.out.println("\t\t 7. Insert New Invoice    ");
		System.out.println("\t\t 8. Report Of No.Items No.Invoice No.Sales    ");
		System.out.println("\t\t 9. Report All Invoices   ");
		System.out.println("\t\t 10. Search One Invoice  ");
		
		System.out.println("\t\t 0.EXIT ");
}
	
	public static void main(String a[]) throws IOException {
		boolean isExit = true;
		
		
		DataBaseSecurity myDataBaseSecurity = new DataBaseSecurity();
		
//		
		Invoice invoiceTable = new Invoice();
		Item itemTable = new Item();
		InvoiceHeade InvoiceHeadeTable= new InvoiceHeade();
		Shop shopTable = new Shop();
		shopMenue myshopMenue = new shopMenue();
		ManageMenue myManageMenue = new ManageMenue();
		NewInvoice myNewInvoice = new NewInvoice();
		

//		System.out.println(" Please Enter DataBase url   ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(" Please Enter the database connection URL :\n");
		myDataBaseSecurity.setUrl(br.readLine());
		System.out.print(" Please user name :");
		myDataBaseSecurity.setUser(br.readLine());
		System.out.print(" Please user password :");
		myDataBaseSecurity.setPass(br.readLine());
		

		
		while (isExit) {

			Scanner sc = new Scanner(System.in);
			mainMenue();
			

try {
			int option = sc.nextInt();

			switch (option) {

			case 1:
//				creat invoice table
//				invoiceTable.invoiceTable();
				invoiceTable.invoiceTable(myDataBaseSecurity.getUrl(),
						myDataBaseSecurity.getUser(), myDataBaseSecurity.getPass());
			
				break;
				
			case 2:
//				creat items table
//				itemTable.itemTable();
				
				itemTable.itemTable(myDataBaseSecurity.getUrl(),
						myDataBaseSecurity.getUser(), myDataBaseSecurity.getPass());
				
				break;
				
			case 3:
//				creat invoice header table
//				InvoiceHeadeTable.invoiceHeaderTable();
				
				InvoiceHeadeTable.invoiceHeaderTable(myDataBaseSecurity.getUrl(),
						myDataBaseSecurity.getUser(), myDataBaseSecurity.getPass());
				
				break;
				
			case 4:
//				creat shop table
//				shopTable.shopTable();
				
				shopTable.shopTable(myDataBaseSecurity.getUrl(),
						myDataBaseSecurity.getUser(), myDataBaseSecurity.getPass());
				
				break;
				
			case 5:
//			        shop menue
				myshopMenue.shopSettingMenue();

				break;
				
			case 6:
//    		manage menue
				myManageMenue.manageShopMenue();
				
				break;
				
			case 7:
//				Inserting A New Invoice 
//				myNewInvoice.insertnewValue();
				
				myNewInvoice.insertnewValue(myDataBaseSecurity.getUrl(),
						myDataBaseSecurity.getUser(), myDataBaseSecurity.getPass());
				
				break;
				
			case 8:
//				
				invoiceTable.reportStatistics(myDataBaseSecurity.getUrl(),
						myDataBaseSecurity.getUser(), myDataBaseSecurity.getPass());
				break;
				
			case 9:
//			Report all invoices	
//				invoiceTable.reportAllInvoice();
				invoiceTable.reportAllInvoice(myDataBaseSecurity.getUrl(),
						myDataBaseSecurity.getUser(), myDataBaseSecurity.getPass());
				break;
				
			case 10:
//				Search One Invoice by ID
//				invoiceTable.getById();
				invoiceTable.getById(myDataBaseSecurity.getUrl(),
						myDataBaseSecurity.getUser(), myDataBaseSecurity.getPass());
				break;
				
				
			case 11:

				
				break;
				
				
				
	case 0:
		
		// ask user if they want to exit program
        System.out.print("Are you sure you want to exit? (Y/N) ");
        String answer = sc.next();
        if (answer.equalsIgnoreCase("Y")) {
        	isExit = false; 
            System.out.println(" See You Soon ");

        }
        	else 
        		isExit = true;
        		     
        		
        break;
    default:
        System.out.println("Invalid choice. Please try again.");
//        break;
//		System.out.println(" See You Soon ");
//		System.exit(0);
//		isExit = false;
		

}

}catch (InputMismatchException e) {
	System.out.println(" Invalid ! Please enter a valid integer");
	sc.nextLine();

}

		}}}
		
