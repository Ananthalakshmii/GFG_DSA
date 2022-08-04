package com.accolite.mathematics;

import java.util.ArrayList;

//roots- max root followed by min root
public class _Problem3_QuadraticEquationRoots {

	public static void main(String[] args) {
		int a=1,b=-7,c=12;
		ArrayList<Integer> list=quadraticRoots(a,b,c);
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+" ");
	}

	private static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		double temp= (b*b - (4*a*c));
		if(temp<0)
			list.add(-1);
		else {
		double sqrt=Math.sqrt(temp);
		double val1= (-b+sqrt)/(2*a);
		double val2= (-b-sqrt)/(2*a);
		list.add((int) Math.floor(Math.max(val1,val2)));
		list.add((int) Math.floor(Math.min(val1,val2)));
		}
		return list;
	}
}
