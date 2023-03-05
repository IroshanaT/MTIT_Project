package vehicledeliveryservicepublisher;

import java.util.Random;
import java.util.Scanner;

public class VehicleDeliveryServicePublishimpl implements VehicleDeliveryServicePublisher{

	@Override
	public void publishService() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("* * * * * * * *  Thank you for using SL Bike Store* * * * * * * *");
		System.out.println("");
		System.out.println("* * * * * * * *  Welcome to Bike Delivery Service  * * * * * * * * ");
		System.out.println("");
		System.out.print("Please Give Your Name : ");
		String Yname = scanner.next();

		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  * * * ");
		System.out.println(" ");
		System.out.println(" WELCOME !! " + Yname);
		System.out.println("");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		int choice = 1;
		
		while (choice == 1) {
			
			System.out.println("");
			System.out.println("**** *** ** *  MOTOR BIKE DELIVERY SERVICE *  ** *** ****");
			System.out.println("");
			

			System.out.print("Do you have a copy of your order number? [1 = Yes || 2 = No]: ");
			int ord = scanner.nextInt();
			System.out.println("");

			Random random = new Random();
			int delivery_Number = random.nextInt(1000);
			int order_Number = random.nextInt(1000);

			
			if (ord == 1) {

				int choice1 = 1;

				while (choice1 == 1) {

			System.out.print("Please Enter the order Number :  ");
			String orderNumber = scanner.next();

			
			System.out.print("Please Enter the  Distance in Kilometers :  ");
			double dist = scanner.nextDouble();
			System.out.println("");
			
			
			System.out.print("Please Enter Your Address: ");
			String address = scanner.next();
			
			
			if (dist >= 1 && dist <= 100) {
				
				double delivery_charges = 100;
				delivery_charges = delivery_charges + ((dist-1) * delivery_charges);
				
				
				System.out.println("Order Number \t: " + orderNumber);
				System.out.println("Delivery Number\t: " + delivery_Number);
				System.out.println("Address \t: " + address);
				System.out.println("Distance in Kilometers \t: " + dist + " KM ");
				System.out.println("Delivery Price \t: " + delivery_charges);
				
				System.out.println("");
				System.out.println("Do you want to keep going ? [Type 1 = Yes | Type 2 = No] : ");
				choice= scanner.nextInt();

					if (choice == 2) {
					
						System.out.println("");
						System.out.println("* ! * ! * ! * ! * ! * ! * ! Thank You * ! * ! * ! * ! * ! * ! * ! *");
						System.out.println();
					}
				
						break;

			} else {
				
				System.out.println("Oops .... We are really Sorry !!! our coverage is only for  1km to 100km..");
				System.out.println(" ");
				
				System.out.println("Do you want to keep going ? [type 1 = Yes || Type 2 = No] : ");
				choice1 = scanner.nextInt();

				if (choice1 == 2) {
					
					System.out.println("");
					System.out.println("===================================== Thank You====================================");
					System.out.println();
					return;
					}
				}
			}
		}

		}
	}
}

	

		


	

