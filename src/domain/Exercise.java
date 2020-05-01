package domain;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Exercise {
    /**
     * Hashes provided string to MD5
     * @param text Text to hash
     * @return Hashed string
     */
    public static String HashToMD5(final String text) {
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(text.getBytes(), 0, text.length()); 
            final BigInteger hashedText = new BigInteger(1, m.digest()); 
            return String.format("%1$032X", hashedText); 
        } catch (Exception e) {
            return null;
        }
    }

}
