package patternBridge.remotes;

import patternBridge.devices.Device;

/**
 * La clase mas completa, extiende de BasicRemote, consecuencia que implemeta Remote
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class AdvancedRemote extends BasicRemote {

	 public AdvancedRemote(Device device) {
	        super.device = device;
	    }

	    public void mute() {
	        System.out.println("Remote: mute");
	        device.setVolume(0);
	    }
}
