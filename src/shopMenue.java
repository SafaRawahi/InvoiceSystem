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
	}
	
	
	public static void main(String a[]) {
		boolean isExit = true;
		while (isExit) {

			Scanner sc = new Scanner(System.in);
			shopSettingMenue();
			

			int option = sc.nextInt();

			switch (option) {

			case 1:
				
				
				break;
	
	
}
}}}