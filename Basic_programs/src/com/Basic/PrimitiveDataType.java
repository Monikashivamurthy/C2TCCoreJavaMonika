package com.Basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		// byte takes 1 byte
		byte byteMax=127;
		byte byteMin=-128;
		
		System.out.println("Min range of byte is" + byteMin + " Max range of byte is " +byteMax);
		// short takes 2 byte
		short shortMax=32767;
		short shortMin=-32768;
		
		System.out.println("Min range of short is" + shortMin + " Max range of short is " + shortMax);
		
		// int  takes 4 byte
		
		int intMax=2147483647;
		int intMin=-2147483648;
		 
		System.out.println("Min range of int is" + intMin + " Max range of int is " + intMax);
		
		// long takes 8 byte
		
		      long longMax=9223372036854775807L;
			  long longMin=-9223372036854775808L;
				
				System.out.println("Min range of long is" + longMin + " Max range of long is " + longMax);
				
				float f=3234.141243278345f;
				double d=3456.14124512345678902345678914f;
				System.out.println("float value is "+f+" double value is "+d);
				
				boolean flag=false;
				System.out.println("boolean value is "+flag);
				}

}
