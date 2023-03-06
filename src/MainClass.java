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
		System.out.println("\t\t 9. Report Of No.Items No.Invoice No.Sales    ");
		
		
		System.out.println("\t\t 0.EXIT ");
}
	
	public static void main(String a[]) {
		boolean isExit = true;
//		boolean manageShopMenue= true;
//		boolean shopSettingMenue= true;
		
		Invoice invoiceTable = new Invoice();
		Item itemTable = new Item();
		InvoiceHeade InvoiceHeadeTable= new InvoiceHeade();
		Shop shopTable = new Shop();
		shopMenue myshopMenue = new shopMenue();
		ManageMenue myManageMenue = new ManageMenue();
		NewInvoice myNewInvoice = new NewInvoice();
		
		while (isExit) {

			Scanner sc = new Scanner(System.in);
			mainMenue();
			
			int num;

			int option = sc.nextInt();

			switch (option) {

			case 1:
//				creat invoice table
				invoiceTable.invoiceTable();
				
				break;
				
			case 2:
//				creat items table
				itemTable.itemTable();
				break;
				
			case 3:
//				creat invoice header table
				InvoiceHeadeTable.invoiceHeaderTable();
				
				break;
				
			case 4:
//				creat shop table
				shopTable.shopTable();
				break;
				
			case 5:
			
				myshopMenue.shopSettingMenue();
				break;
				
			case 6:

				myManageMenue.manageShopMenue();
				
				break;
				
			case 7:
				myNewInvoice.insertnewValue();
				
				break;
				
			case 8:
				myNewInvoice.insertnewValue();
				
				break;
		
				
				
				
				
	case 0:
		System.out.println(" See You Soon ");
		System.exit(0);

		break;

}

}
isExit = false;
		}}
		
