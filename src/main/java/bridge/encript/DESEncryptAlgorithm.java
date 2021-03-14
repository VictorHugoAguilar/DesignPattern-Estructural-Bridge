package bridge.encript;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import sun.misc.BASE64Encoder;

public class DESEncryptAlgorithm implements IEncryptAlgorithm {
	private static final String DES = "DES";
	private static final String DES_ECB_PKCS5Padding = "DES/ECB/PKCS5Padding";

	@Override
	public String encrypt(String message, String password) throws Exception {
		DESKeySpec dks = new DESKeySpec(message.getBytes());
		SecretKeyFactory skf = SecretKeyFactory.getInstance(DES);
		SecretKey deskey = skf.generateSecret(dks);
		
		Cipher desCipher = Cipher.getInstance(DES_ECB_PKCS5Padding);
		desCipher.init(Cipher.ENCRYPT_MODE, deskey);

		BASE64Encoder base64Encoder = new BASE64Encoder();
		return base64Encoder.encode(desCipher.doFinal(message.getBytes()));
	}

}
