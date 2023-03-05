package feedbackservicepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class ServiceActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext context) throws Exception {
		
		System.out.println("FeedbackService Publisher Start");
		FeedbackServicePublish publisherService = new FeedbackServicePublishImpl();
		publishServiceRegistration = context.registerService(FeedbackServicePublish.class.getName(), publisherService, null);
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Stop Feedback Service publisher!!!...");
		publishServiceRegistration.unregister();

	}

}
