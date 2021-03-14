package bridge.impl;

import bridge.encript.IEncryptAlgorithm;

/**
 * Clase que representa el puente, la clase implementa IMessageEncrypt y delega
 * la responsabilidad al método de encriptamiento asignado durante la creación
 * del objeto.
 * 
 * En el constructor recibe la implementación, a la cual delegará la
 * responsabilidad de encriptar el mensaje y en el método encryptMessage es
 * donde el puente entre el cliente y la implementación se realizaran. En este
 * paso puede existir una transformación de los parámetros de entrada y salida
 * de la clase de encrptamiento para que coincidan con los esperado por el
 * cliente. En ese punto punto también es habitual utilizar el patron Adapter,
 * sobre todo si las clases de encriptamiento tuvieran interfaces comunes
 * incompatibles.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class DefaultMessageEncryptImpl implements IMessageEncrypt {

	private IEncryptAlgorithm encryptAlgoritm;

	public DefaultMessageEncryptImpl(IEncryptAlgorithm encryptAlgoritm) {
		this.encryptAlgoritm = encryptAlgoritm;
	}

	@Override
	public String encryptMessage(String message, String password) throws Exception {
		return encryptAlgoritm.encrypt(message, password);
	}

}
