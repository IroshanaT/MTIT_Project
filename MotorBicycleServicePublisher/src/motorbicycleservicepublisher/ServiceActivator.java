package motorbicycleservicepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ServiceActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext context) throws Exception {
		
		System.out.println("Start Motor-Bicycle Service publisher!!!...");
		MotorBicycleServicePublish publisherService = new MotorBicycleServicePublishImpl();
		publishServiceRegistration = context.registerService(MotorBicycleServicePublish.class.getName(), publisherService, null);
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Stop Motor-Bicycle Service publisher!!!...");
		publishServiceRegistration.unregister();

	}

}
