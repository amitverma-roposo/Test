package com.git.test_git;

import java.util.Date;

public class A {
	
	

	public static  void main(String[] a ){
		String str = "a_bcd_hjk";
		String s = "_";
		System.out.println(str.substring(0, str.indexOf("_")));
		System.out.println(str.contains(s));
	}
}
