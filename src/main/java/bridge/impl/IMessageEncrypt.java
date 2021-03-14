package bridge.impl;

/**
 * Interface que define la estructura que deberán tener las clases puente,
 * mediante esta interface el cliente se comunicará con los algoritmos de
 * encriptamiento concretos.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public interface IMessageEncrypt {
	public String encryptMessage(String message, String password) throws Exception;
}
