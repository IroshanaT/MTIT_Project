package vehicledeliveryservicepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ServiceActivator implements BundleActivator {

	ServiceRegistration BikeDeliveryRegistration;



	public void start(BundleContext context) throws Exception {
		
		System.out.println("Start Bike Delivery Publisher!");
		VehicleDeliveryServicePublisher publisherService = new VehicleDeliveryServicePublishimpl();
		BikeDeliveryRegistration = context.registerService(VehicleDeliveryServicePublisher.class.getName(), publisherService, null);
		}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Stop Bike Delivery Publisher!");
		BikeDeliveryRegistration.unregister();
	}

}
