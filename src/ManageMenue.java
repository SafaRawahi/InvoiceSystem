import java.util.InputMismatchException;
import java.util.Scanner;

public class ManageMenue {
	
	
	
	
static void manageShopMenue() {
		
		

	boolean isExit = true;
	 

	while (isExit) {
		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t \t ***Please Choose One Option*** \t \t");
		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t\t 1. Add Items  ");
		System.out.println("\t\t 2. Delete Items ");
		System.out.println("\t\t 3. Change Item Price  ");
		System.out.println("\t\t 4. Report All Items  ");
		System.out.println("\t\t 5. Back To Main Menue  ");

		Scanner sc = new Scanner(System.in);
	
		Item itemTable = new Item();
		DataBaseSecurity myDataBaseSecurity = new DataBaseSecurity();
		try {
		int option = sc.nextInt();

		switch (option) {

		case 1:
//			inserting value on table item
//			itemTable.insertItem();
			
			itemTable.insertItem(myDataBaseSecurity.getUrl(),
					myDataBaseSecurity.getUser(), myDataBaseSecurity.getPass());
			break;
			
		case 2:
//			delet item
//			itemTable.deleteById();
			
			itemTable.deleteById(myDataBaseSecurity.getUrl(),
					myDataBaseSecurity.getUser(), myDataBaseSecurity.getPass());
			break;
			
		case 3:
//			updating 
//			itemTable.updateById();
			
			itemTable.updateById(myDataBaseSecurity.getUrl(),
					myDataBaseSecurity.getUser(), myDataBaseSecurity.getPass());
			
			break;
			
		case 4:
//			report all items
//			itemTable.reportAllItems();
			
			itemTable.reportAllItems(myDataBaseSecurity.getUrl(),
					myDataBaseSecurity.getUser(), myDataBaseSecurity.getPass());
			break;
			
			
       case 5:
    	   isExit = false;
			break;

		}
		}
	catch (InputMismatchException e) {
		System.out.println(" Invalid ! Please enter a valid integer");
		sc.nextLine();

	}}
}}
