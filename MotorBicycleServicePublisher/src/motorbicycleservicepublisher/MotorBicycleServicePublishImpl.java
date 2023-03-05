package motorbicycleservicepublisher;

import java.util.Random;
import java.util.Scanner;

public class MotorBicycleServicePublishImpl implements MotorBicycleServicePublish {

	@Override
	public void publishService() {
	
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please Enter Your Name : ");
		String name = scanner.nextLine();

		System.out.println("");
		System.out.println("Hello!.." + name);
		System.out.println("");

		int bike = 1;
		while (bike == 1) {

			System.out.println("\t\t   ****************SL Bike Store****************");
			System.out.println("");
			System.out.println("\t\t    	Model		" + "Price + Tax(%)");
			System.out.println("\t\t    =========================================");
			System.out.println("\t\t    1. Honda Navi		 " +      " 250,000.00");
			System.out.println("\t\t    2. TVS Apache RTR	     " +  " 400,000.00");
			System.out.println("\t\t    3. Bajaj Pulsar NS 200   " +  " 380,000.00");
			System.out.println("\t\t    4. Hero Hunk 200R	     " +  " 450,000.00");
			System.out.println("\t\t    5. Yamaha FZS	       " +    " 425,000.00");
			System.out.println("\t\t    0. Exit");
			System.out.println("");

			System.out.print("Please Select Your Model:  ");
			int optNo = scanner.nextInt();

			if (optNo == 1 || optNo == 2 || optNo == 3 || optNo == 4 || optNo == 5) {

				Random random = new Random();
				int orderNo = random.nextInt(1000);

					if (optNo == 1) {
						double amount = 250000.00;
						System.out.println("Order No \t: " + orderNo);
						System.out.println("Bike Model \t: " + "Honda Navi");
						System.out.println("Amount\t: " + amount);
						System.out.println("");

					} else if (optNo == 2) {
						double amount = 400000.00;
						System.out.println("Order No \t: " + orderNo);
						System.out.println("Bike Model \t: " + "TVS Apache RTR");
						System.out.println("Amount\t: " + amount);
						System.out.println("");

					} else if(optNo == 3){
						double amount = 380000.00;
						System.out.println("Order No \t: " + orderNo);
						System.out.println("Bike Model \t: " + "Bajaj Pulsar NS 200");
						System.out.println("Amount\t: " + amount);
						System.out.println("");

					} else if(optNo == 4){
						double amount = 450000.00;
						System.out.println("Order No \t: " + orderNo);
						System.out.println("Bike Model \t: " + "Hero Hunk 200R");
						System.out.println("Amount\t: " + amount);
						System.out.println("");
						
					} else if(optNo == 5){
						double amount = 425000.00;
						System.out.println("Order No \t: " + orderNo);
						System.out.println("Bike Model \t: " + "Yamaha FZS");
						System.out.println("Amount\t: " + amount);
						System.out.println("");
					
					} else {
						System.out.println("Unavailable Bike Model");
					
					}					

					System.out.println("Do you want to continue ? (1/2) : ");
					bike = scanner.nextInt();

					if (bike == 2) {
						System.out.println("");
						System.out.println("Thank You!!!...");
						System.out.println();
					}

				} else if (optNo == 0) {

					System.out.println("");
					System.out.println("Thank You!!!...");
					System.out.println();
					return;

				}else {

					System.out.println("");
					System.out.println("Sorry, Invalid Operation No. Do you want to continue.? (1/2) : ");
					bike = scanner.nextInt();

					if (bike == 2) {
						System.out.println("");
						System.out.println("Thank You!!!...");
						System.out.println();
					}

				} 
			
			}

			while (bike != 1 && bike != 2) {
				System.out.println("");
				System.out.println("Sorry, Invalid Operation No.");
				System.out.println("Type 1 = Continue Ordering / Type 2 = Exit  ");
				bike = scanner.nextInt();

				if (bike == 2) {
					System.out.println();
					System.out.println("Thank You!!!...");
					System.out.println();
				}
			}

		}
		
	}
