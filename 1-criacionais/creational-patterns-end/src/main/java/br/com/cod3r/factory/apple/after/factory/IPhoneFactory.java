package br.com.cod3r.factory.apple.after.factory;

import br.com.cod3r.factory.apple.after.model.IPhone;

/**
 * 
 */
public abstract class IPhoneFactory {

	public IPhone orderIPhone() {
		IPhone device = null;

		// this is the factory method, that has the responsability to instance a method
		device = createIPhone();

		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();

		return device;
	}

	// any class will extends this one, must have implements this abstract class
	protected abstract IPhone createIPhone();
}
