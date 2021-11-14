package checklist;

import java.util.Base64;

public class encryption {
	 public static String PasswordEncryption(String password)
	    {
	        Base64.Encoder encoder = Base64.getEncoder();
	        return encoder.encodeToString(password.getBytes());
	    }

	    public static String PasswordDecryption(String password)
	    {
	        Base64.Decoder decoder = Base64.getDecoder();
	        return new String(decoder.decode(password));
	    }
}
