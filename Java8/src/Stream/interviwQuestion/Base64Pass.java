package Stream.interviwQuestion;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Base64Pass {

	public static void main(String[] args) throws Exception {
		String pwd="Jay@123"+ "Bharti";
		
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] digest = md.digest(pwd.getBytes());
		String encrypted = new String(digest);
		System.out.println("Encrtyped : "+encrypted);
		
		Encoder encoder = Base64.getEncoder();
		byte[] encode = encoder.encode(digest);
		System.out.println("Encrtyped + Encoded :: "+ new String (encode));
		
		
		
		
		
		/*Encoder encoder = Base64.getEncoder();
		
		//converting String to byte[] and passing as input for encode() method
		byte[] encode = encoder.encode(pwd.getBytes());
		
		//Converting byte[] to String
		String encodedpwd = new String(encode);
		System.out.println(encodedpwd);
		
		
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodedpwd);
		String DecodedPwd = new String(decode);
		System.out.println(DecodedPwd);
	*/
	}
}
