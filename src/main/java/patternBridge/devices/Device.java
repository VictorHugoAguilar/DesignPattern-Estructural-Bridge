package patternBridge.devices;

/**
 * Interfaz común para los dispositivos, que la implemente
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public interface Device {
	boolean isEnabled();

	void enable();

	void disable();

	int getVolume();

	void setVolume(int percent);

	int getChannel();

	void setChannel(int channel);

	void printStatus();
}
