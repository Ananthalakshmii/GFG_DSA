package com.accolite.bitmagic;

public class CountSetBits_LookupTableMethod {

	static int table[]=new int[256];
	public static void main(String[] args) {
		int n=7;
		int result=countSetBitsLookupTable(n);
		System.out.println(result);
	}

	private static int countSetBitsLookupTable(int n) {//checking for 8 bits 4 times in a 32 bit representation -- 8 bits- 0 to 2^7-1-- 0 to 255
		initialize();
		int result= table[n & 0xff]; //0xff- hex representation of last 8 bits
		n=n>>8;
		result+= table[n & 0xff];
		n=n>>8;
		result+= table[n & 0xff];
		n=n>>8;
		result+= table[n & 0xff];
	
		return result;
	}

	private static void initialize() {
		table[0]=0;
		for(int i=1;i<256;i++)
			table[i]=(i&1) + table[i/2]; // from naive solution - checking with last bit and right shifting
		
	}
}


//theta(1) 