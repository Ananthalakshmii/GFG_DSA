package com.accolite.recursion;

import java.util.ArrayList;
import java.util.HashMap;

public class _Problem12_PossibleWordsFromPhoneDigits {
	public static void main(String[] args) {
		int n=3,a[]= {2,3,4};
		ArrayList<String> list=possibleWords(a,n);
		list.stream().forEach(System.out::println);
	}

	private static ArrayList<String> possibleWords(int[] a, int n) {
		ArrayList<String> list=new ArrayList<String>();
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "");
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");
		String current="";
		int index=0;
		possibleWords(a,n,list,current,index,map);
		return list;
	}

	private static void possibleWords(int[] a, int n, 
			ArrayList<String> list, String current, int index,
			HashMap<Integer, String> map) {
		if(index==n) {
			list.add(current);
			return;
		}
		
		String temp=map.get(a[index]);
		for(int i=0;i<temp.length();i++) {
			current=current+temp.charAt(i);
			possibleWords(a, n, list, current, index+1, map);
			current=current.substring(0, current.length()-1); //to facilitate for next possible combination
		}
		
	}

}


/*
 adg ad
adh ad
adi ad
ad a
aeg ae
aeh ae
aei ae
ae a
afg af
afh af
afi af
af a
a 
bdg bd
bdh bd
bdi bd
bd b
beg be
beh be
bei be
be b
bfg bf
bfh bf
bfi bf
bf b
b 
cdg cd
cdh cd
cdi cd
cd c
ceg ce
ceh ce
cei ce
ce c
cfg cf
cfh cf
cfi cf
cf c
c 
 */
