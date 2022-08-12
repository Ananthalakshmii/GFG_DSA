package com.accolite.recursion;

import java.util.ArrayList;
import java.util.Collections;

public class _Problem11_PowerSet {
	public static void main(String[] args) {
		String str="abc";
		ArrayList<String> list=powerSet(str);
		Collections.sort(list);
		
		for(String s:list)
			System.out.println(s);
	}

	private static ArrayList<String> powerSet(String str) {
		ArrayList<String> list=new ArrayList<String>();
		String current="";
		int index=0;
		 powerSet(str,list,current,index);
		 return list;
	}

	private static void powerSet(String str, 
			ArrayList<String> list, String current, int index) {
		if(index==str.length()) {
			list.add(current);
			return ;
		}
		
		powerSet(str, list, current, index+1);
		powerSet(str, list, current+str.charAt(index), index+1);

	}

}
