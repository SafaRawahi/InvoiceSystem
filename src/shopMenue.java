import java.util.Scanner;

public class shopMenue {
	
	
	
	static void shopSettingMenue() {
		
		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t \t ***Please Choose One Option*** \t \t");
		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t\t 1. Load Data  ");
		System.out.println("\t\t 2. Set Shop Name  ");
		System.out.println("\t\t 3. Set Invoice Header  ");
		System.out.println("\t\t 4. Back To Main Menue  ");
	
		boolean isExit = true;
		while (isExit) {

			Scanner sc = new Scanner(System.in);
//			shopSettingMenue();
			Shop shopTable = new Shop();
			InvoiceHeade InvoiceHeadeTable= new InvoiceHeade();
			Invoice invoiceTable = new Invoice();
			DataBaseSecurity myDataBaseSecurity = new DataBaseSecurity();

			
			int option = sc.nextInt();

			switch (option) {

			case 1:
//				load data invoice
//				invoiceTable.insertValue();
				
				invoiceTable.insertValue(myDataBaseSecurity.getUrl(),
						myDataBaseSecurity.getUser(), myDataBaseSecurity.getPass());
				break;
				
			case 2:
//				Set Shop Name
//				shopTable.insertShopName();
				
				shopTable.insertShopName(myDataBaseSecurity.getUrl(),
						myDataBaseSecurity.getUser(), myDataBaseSecurity.getPass());
				
				break;
			case 3:
//	insert invoice header
//				InvoiceHeadeTable.insertInvoiceHeader();
				InvoiceHeadeTable.insertInvoiceHeader(myDataBaseSecurity.getUrl(),
						myDataBaseSecurity.getUser(), myDataBaseSecurity.getPass());
				
				break;
			case 4:
				 isExit = false;

	
				break;
	
}
}
		
		}
	}