package com.accolite.arrays;

public class _Problem31_PatternSearching {
	public static void main(String[] args) {
		boolean result= searchPattern("abcdefh","bcd");
		System.out.println(result);
		System.out.println(searchPattern("axzy","xy"));
	}

	private static boolean searchPattern(String string, String string2) {
		int len1=string.length();
		int len2=string2.length();
		
		for(int i=0;i<len1;i++) {
			if(string.charAt(i)==string2.charAt(0)) {
				String sub=string.substring(i, len2+1);
				if(sub.equals(string2))
					return true;
			}
		}
		
		return false;
		
		/*
		if(string.contains(string2))
			return true;
		return false;
		*/
	}

}
