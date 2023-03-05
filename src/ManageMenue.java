import java.util.Scanner;

public class ManageMenue {
	
	
	
	
static void manageShopMenue() {
		
		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t \t ***Please Choose One Option*** \t \t");
		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t\t 1. Add Items  ");
		System.out.println("\t\t 2. Delete Items ");
		System.out.println("\t\t 3. Change Item Price  ");
		System.out.println("\t\t 4. Report All Items  ");
		System.out.println("\t\t 5. Back To Main Menue  ");
}
public static void main(String a[]) {
	boolean isExit = true;
	while (isExit) {

		Scanner sc = new Scanner(System.in);
		manageShopMenue();
		Item itemTable = new Item();
		int option = sc.nextInt();

		switch (option) {

		case 1:
			itemTable.insertItem();
			
			break;
			
		case 2:
			itemTable.deleteById();
			
			break;
			
		case 3:
			
			itemTable.updateById();
			break;
			
		case 4:
			
			itemTable.reportAllItems();
			break;
			
       case 5:
			
			
			break;

		}}}
}
