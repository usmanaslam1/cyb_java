package com.usman.util;

public class CryptoUtil {
	
	public static String xorEqualStrings(String a, String b) throws Exception{
		
		byte[] bA=a.getBytes();
		byte[] bB=b.getBytes();
		
		if(bA.length!=bB.length)throw new Exception ("Size mismatch");
		
		byte[] out=new byte[bA.length];
		
		for (int x=0;x<bA.length;x++) {
			out[x]=(byte)(bA[x]^bB[x]);
		}
		
		String so=String.valueOf(out);
		
		return String.valueOf(out);
		
	}

}
