package safetyequipmentspublisherservice;

import java.util.Random;
import java.util.Scanner;

public class SafetyEquipmentsPublishImpl implements SafetyEquipmentsPublish {

	@Override
	public void publishService() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please Enter Your Name : ");
		String name = scanner.nextLine();

		System.out.println("");
		System.out.println("Hello!.." + name);
		System.out.println("");

		int equ = 1;
		while (equ == 1) {

			System.out.println("\t\t    ****************SL BIKE STORE****************");
			System.out.println("");
			System.out.println("\t\t    Equipment Type		" + "Price (Per Unit)");
			System.out.println("\t\t    =========================================");
			System.out.println("\t\t    1. Safety Helmet	" +  "	2500.00");
			System.out.println("\t\t    2. Safety Jacket	" +  "	3500.00");
			System.out.println("\t\t    3. Knee Pads		" +  "	1250.00");
			System.out.println("\t\t    4. Gloves			" +  "	1350.00");
			System.out.println("\t\t    0. Exit");
			System.out.println("");

			System.out.print("Please Select Equipment Type:  ");
			int optNo = scanner.nextInt();

			if (optNo == 1 || optNo == 2 || optNo == 3 || optNo == 4) {

				System.out.print("Enter Number Of Units Do You Buy: ");
				double unit = scanner.nextInt();
				System.out.println();

				Random random = new Random();
				int orderNo = random.nextInt(1000);

				if (unit > 0 && unit <= 10) {

					if (optNo == 1) {
						double amount = (2500.00 * unit);
						System.out.println("Order No \t: " + orderNo);
						System.out.println("Cake Type \t: " + "Safety Helmet");
						System.out.println("Number of Units \t: " + unit);
						System.out.println("Amount\t: " + amount);
						System.out.println("");

					} else if (optNo == 2) {
						double amount = (3500.00 * unit);
						System.out.println("Order No \t: " + orderNo);
						System.out.println("Cake Type \t: " + "Safety Jacket");
						System.out.println("Weight \t: " + unit);
						System.out.println("Amount\t: " + amount);
						System.out.println("");

					} else if(optNo == 3){
						double amount = (1250.00 * unit);
						System.out.println("Order No \t: " + orderNo);
						System.out.println("Cake Type \t: " + "Knee Pads");
						System.out.println("Weight \t: " + unit);
						System.out.println("Amount\t: " + amount);
						System.out.println("");

					} else if(optNo == 4){
						double amount = (1350.00 * unit);
						System.out.println("Order No \t: " + orderNo);
						System.out.println("Cake Type \t: " + "Gloves");
						System.out.println("Weight \t: " + unit);
						System.out.println("Amount\t: " + amount);
						System.out.println("");

					} else {
						System.out.println("Unavailable Equipment Type");
					
					}					

					System.out.println("Do you want to continue ? (1/2) : ");
					equ = scanner.nextInt();

					if (equ == 2) {
						System.out.println("");
						System.out.println("Thank You!!!...");
						System.out.println();
					}

				} else {

					System.out.println("Sorry!!! Maximum requesting units for order is 10 units at once..!");
					System.out.println("Do you want to continue ? (1/2) : ");
					equ = scanner.nextInt();

					if (equ == 2) {
						System.out.println("");
						System.out.println("Thank You!!!...");
						System.out.println();
						return;
					}

				}

			} else if (optNo == 0) {

				System.out.println("");
				System.out.println("Thank You!!!...");
				System.out.println();
				return;

			} else {

				System.out.println("");
				System.out.println("Sorry, Invalid Operation No. Do you want to continue.? (1/2) : ");
				equ = scanner.nextInt();

				if (equ == 2) {
					System.out.println("");
					System.out.println("Thank You!!!...");
					System.out.println();
				}

			}

			while (equ != 1 && equ != 2) {
				System.out.println("");
				System.out.println("Sorry, Invalid Operation No.");
				System.out.println("Type 1 = Continue Ordering / Type 2 = Exit  ");
				equ = scanner.nextInt();

				if (equ == 2) {
					System.out.println();
					System.out.println("Thank You!!!...");
					System.out.println();
				}
			}

		}
		
	}

}
