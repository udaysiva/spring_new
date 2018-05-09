package iib.gov.in.util;
import java.security.MessageDigest;
import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.stereotype.Component;

import sun.misc.BASE64Encoder;

@Component
public class UtilClass {



		
	public  UtilClass(){
	}
	
	
	public  String encrypt(String password)throws Exception{
		final MessageDigest md = MessageDigest.getInstance("SHA");
        final byte[] digestOfPassword = md.digest("message"
                           .getBytes("utf-8"));        
        final byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
        for (int j = 0, k = 16; j < 8;) {
                   keyBytes[k++] = keyBytes[j++];
        }
        final SecretKey key = new SecretKeySpec(keyBytes, "DESede");
        final IvParameterSpec iv = new IvParameterSpec(new byte[8]);        
        final Cipher cipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");        
        cipher.init(Cipher.ENCRYPT_MODE, key, iv);        
        final byte[] plainTextBytes = password.getBytes("utf-8");        
        final byte[] cipherText = cipher.doFinal(plainTextBytes);        
        // final String encodedCipherText = new sun.misc.BASE64Encoder()        
        // .encode(cipherText);        
        String hash = (new BASE64Encoder()).encode(cipherText);
        return hash;
	}	

}
