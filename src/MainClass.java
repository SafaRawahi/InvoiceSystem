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
		
		System.out.println("\t\t Shop Setting Menue  ");
		System.out.println("\t\t 3. Load Data  ");
		System.out.println("\t\t 4. Set Shop Name  ");
		System.out.println("\t\t 4. Set Invoice Header  ");
}
	
	public static void main(String a[]) {
		boolean isExit = true;
		Invoice invoiceTable = new Invoice();
		Item itemTable = new Item();
		
		
		while (isExit) {

			Scanner sc = new Scanner(System.in);
			mainMenue();
			
			int num;

			int option = sc.nextInt();

			switch (option) {

			case 1:
				invoiceTable.invoiceTable();
				break;
				
			case 2:
				itemTable.itemTable();
				break;
		
		
		
	}
		}}}
		
