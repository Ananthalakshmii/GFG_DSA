package com.accolite.arrays;

public class _Problem25_GameOfChocolates {// wythoff's game
	public static void main(String[] args) {
		boolean ans=game(1,2);
		System.out.println(ans);
		System.out.println(game(1,3));
		System.out.println(game(13,8));
	}

	private static boolean game(int a, int b){
		/*double constant=1.618;
		if((a==(int)((b*constant)-b)) && (b==(int)Math.ceil(a*constant)))
			return false;//bunty
		else
			return true;//dolly*/
		
    int diff = Math.abs(b - a);
     double d = 1 + Math.sqrt(5);
    d /= 2;
    d *= diff;

    if((int)d == Math.min(a, b))
       return false; //bunty
       return true; //dolly
   
}


}
