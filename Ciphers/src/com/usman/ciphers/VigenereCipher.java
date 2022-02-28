package com.usman.ciphers;



public class VigenereCipher {

	
	static char[]  vKey;  //Vigenere key (same length as the length of message)
	static final int MODULUS=26; //for cyclic arithmetic for finite set of English alphabets
	static final char CHAR_OFFSET='A'; 
	
	
	//This function ensures that the key is the same length as the plaintext or ciphertext 
	
	private static void initialize(String vigenreKey, int inputTextLength) {
		
		vKey=new char[inputTextLength];
		int idx=0;
		
		for (int x=0;x<inputTextLength;x++) {
			vKey[x]=vigenreKey.charAt(idx);	
			idx=(idx>=vigenreKey.length()-1?0:idx+1);
		}
		
	}
	
	public static String getKey() {
		return String.valueOf(vKey);
	}
	
	public static String encrypt(String plainText, String key) {
		initialize(key, plainText.length());
		
		char[] out=new char[plainText.length()];
		for (int x=0;x<plainText.length(); x++) {
			int e=(plainText.charAt(x)+vKey[x])%MODULUS;
			out[x]=(char)(e+CHAR_OFFSET);
		}
		
		return String.valueOf(out);
		
	}
	
	public static String decrypt(String cipherText, String key) {
		initialize(key, cipherText.length());
		
		char[] out=new char[cipherText.length()];
		for (int x=0;x<cipherText.length(); x++) {
			int d=(cipherText.charAt(x)-vKey[x])%MODULUS;
			if(d<0)d+=MODULUS;
			if(d>MODULUS)d-=MODULUS;
			out[x]=(char)(d+CHAR_OFFSET);
		}
		
		return String.valueOf(out);
	}
	

}
