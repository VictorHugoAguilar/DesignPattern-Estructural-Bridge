package bridge.encript;

/**
 * Interfaz común para todas las implementaciones de algoritmos de encriptado En
 * la clase se define el método encryptMessage la cual delegará la
 * reponsabilidad de encriptamiento a una de las implementaciones.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public interface IEncryptAlgorithm {

	public String encrypt(String message, String password) throws Exception;

}
