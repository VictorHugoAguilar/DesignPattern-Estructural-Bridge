package patternBridge;

import patternBridge.devices.Device;
import patternBridge.devices.Radio;
import patternBridge.devices.TV;
import patternBridge.remotes.AdvancedRemote;
import patternBridge.remotes.BasicRemote;

/**
 * Bridge (puente) entre dispositivos y controles remotos Este ejemplo muestra
 * la separación entre las clases de los remotos y los dispositivos que
 * controlan.
 * 
 * Los remotos actúan como abstracciones, y los dispositivos son sus
 * implementaciones. Gracias a las interfaces comunes, los mismos remotos pueden
 * funcionar con distintos dispositivos y viceversa.
 * 
 * El patrón Bridge permite cambiar o incluso crear nuevas clases sin tocar el
 * código de la jerarquía opuesta.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class Demo {
	public static void main(String[] args) {
		testDevice(new TV());
		testDevice(new Radio());
	}

	public static void testDevice(Device device) {
		System.out.println("Tests with basic remote.");
		BasicRemote basicRemote = new BasicRemote(device);
		basicRemote.power();
		device.printStatus();

		System.out.println("Tests with advanced remote.");
		AdvancedRemote advancedRemote = new AdvancedRemote(device);
		advancedRemote.power();
		advancedRemote.mute();
		device.printStatus();
	}
}
