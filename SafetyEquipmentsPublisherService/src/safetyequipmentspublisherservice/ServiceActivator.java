package safetyequipmentspublisherservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class ServiceActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext context) throws Exception {
		
		System.out.println("Safety Equipments Publisher Service Start");
		SafetyEquipmentsPublish publisherService = new SafetyEquipmentsPublishImpl();
		publishServiceRegistration = context.registerService(SafetyEquipmentsPublish.class.getName(), publisherService, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stop Safety Equipments Publisher Service!");
		publishServiceRegistration.unregister();

	}

}
