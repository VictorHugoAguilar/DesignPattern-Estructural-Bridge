package bridge.encript;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

import sun.misc.BASE64Encoder;

public class AESEncryptAlgorithm implements IEncryptAlgorithm {
	private static final String AES = "AES";

	@Override
	public String encrypt(String message, String password) throws Exception {
		// Generamos una clave de 128 bits adecuada para AES
		KeyGenerator keyGenerator = KeyGenerator.getInstance(AES);
		keyGenerator.init(128);
		Key key = keyGenerator.generateKey();

		Cipher c = Cipher.getInstance(AES);
		c.init(Cipher.ENCRYPT_MODE, key);

		byte[] encVal = c.doFinal(message.getBytes());
		String enncryptedValue = new BASE64Encoder().encode(encVal);

		return enncryptedValue;
	}
}
