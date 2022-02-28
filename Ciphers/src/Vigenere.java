import java.util.Scanner;

import com.usman.ciphers.VigenereCipher;
import com.usman.util.CryptoUtil;

public class Vigenere {

	public static void main (String args[]) throws Exception {
		
		
		String a="HELLO";
		String b="WORLD";
		
		
		System.out.println(CryptoUtil.xorEqualStrings(a, a));
		
		
		/*System.out.println("Enter plaintext : ");		
		System.out.println("Enter key : ");
		Scanner scan=new Scanner(System.in);*/


		//String pt=scan.next();
		//String k=scan.next();
		
		
		
		/*String s="HELLOWORLD";
		String k="ISO";
		String e=VigenereCipher.encrypt(s,k);
		String d=VigenereCipher.decrypt(e,k);

		System.out.println("Plain Text: "+s);
		System.out.println("Key: "+VigenereCipher.getKey());
		System.out.println("Cipher Text: "+e);*/
	}
	
}
