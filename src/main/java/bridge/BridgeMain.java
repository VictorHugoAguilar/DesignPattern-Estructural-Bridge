package bridge;

import bridge.encript.AESEncryptAlgorithm;
import bridge.encript.DESEncryptAlgorithm;
import bridge.encript.NoEncryptAlgorithm;
import bridge.impl.DefaultMessageEncryptImpl;
import bridge.impl.IMessageEncrypt;

/**
 * 
 * De la linea 19-21 creamos las Abstracciones a las cuales se les establece la
 * implementación que utilizarán en el constructor. Cuando estas abstracciones
 * sean utilizadas por el cliente, no se dará cuenta que implementación se esta
 * utilizando y lo que pase dentro de la Abstracción será totalmente
 * transparente para el.
 * 
 * Cualquiera que sea la implementación utilizada, el cliente no se da cuenta ya
 * que desacoplamos la implementación de la abstracción , lo cual es el objetivo
 * de este ejemplo, podemos apreciar que desde el cliente estamos instanciando
 * las Abstracciones, sin embargo, esto lo podríamos relizar en otras parte, de
 * tal manera que el cliente sólo reciba la abstracción por default y porá tener
 * el método de encriptamiento definido desde la configuración.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class BridgeMain {

	public static void main(String[] args) {

		IMessageEncrypt aesImpl = new DefaultMessageEncryptImpl(new AESEncryptAlgorithm());
		IMessageEncrypt desImpl = new DefaultMessageEncryptImpl(new DESEncryptAlgorithm());
		IMessageEncrypt noImpl = new DefaultMessageEncryptImpl(new NoEncryptAlgorithm());

		try {
			final String message = "<Persona><Nombre>Victor Hugo</Nombre></Persona>";

			String messageAES = aesImpl.encryptMessage(message, "QWERTYUIOP");
			System.out.println("message AES => " + messageAES);

			String messageDES = desImpl.encryptMessage(message, "QWERTYUIOP");
			System.out.println("message DES => " + messageDES);

			String messageNO = noImpl.encryptMessage(message, null);
			System.out.println("message NO_ENC => " + messageNO);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
