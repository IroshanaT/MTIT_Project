package motorbicycleservicesubscriber;

import motorbicycleservicepublisher.MotorBicycleServicePublish;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class ServiceActivator implements BundleActivator {

	ServiceReference OrderRef;
	
	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Start Mortor Bicycle Service Subscriber.!");
		

	OrderRef = context.getServiceReference(MotorBicycleServicePublish.class.getName());
	MotorBicycleServicePublish MotorBicycleServicePublish = (MotorBicycleServicePublish)context.getService(OrderRef);
		
		Scanner scn = new Scanner(System.in);

		int opt = 1;
		while (opt == 1) {

			System.out.println("");
			System.out.println("       Welcome to SL Bike Store                        ");
			System.out.println("");

			System.out.println("\t\t             Our Services                 ");
			System.out.println("\t\t    ----------------------------------------");
			System.out.println("");
			System.out.println("\t\t\t    1. Motor Bicycle Order Service");
			System.out.println("\t\t\t    2. Safety Equipments Order Service");
			System.out.println("\t\t\t    3. Delivery Service");
			System.out.println("\t\t\t    4. Feedback Services");
			System.out.println("\t\t\t    0. Exit");
			System.out.println("");
			System.out.println("\t\t    ----------------------------------------");
			System.out.println("");

			System.out.print("Please Enter Your Option(1/2/3/4/0) : ");
			int opt2 = scn.nextInt();

			if (opt2 == 1) {
				System.out.println("");
				MotorBicycleServicePublish.publishService();
				System.out.println("");

				System.out.println("Do you want to get another service ? [Type 1 = Yes | Type 2 = No] : ");
				opt = scn.nextInt();

				if (opt == 2) {
					System.out.println("");
					System.out.println("* * * * * * * * * * * * * * * * * THANK YOU * * * * * * * * * * * * * * * * * * * * *");
					System.out.println("");
				
				}

			}else if (opt2 == 0) {

				System.out.println("");
				System.out.println("                                THANK YOU                                 ");
				System.out.println("");
				return;

			} else {
				System.out.println("");
				System.out.println("Invalid Input.!!Do you want to continue.? [Type 1 = Yes | Type 2 = No] : ");
				opt = scn.nextInt();

				if (opt == 2) {
					System.out.println("");
					System.out.println("                            THANK YOU                               ");
					System.out.println("");
				}
			}

			while (opt != 1 && opt != 2) {
				System.out.println("");
				System.out.println("Invalid Input.");
				System.out.println("Type 1 = Continue Services | Type 2 = Exit ");
				opt = scn.nextInt();

				if (opt == 2) {
					System.out.println();
					System.out.println("**********************************THANK YOU********************************************");
					System.out.println("");
				}
			}

		}

		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Stop Mortor Bicycle Service Subscriber.!!!!...");
		context.ungetService(OrderRef);
	}

}
