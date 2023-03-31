package com.practice.test.practice;

import org.openqa.selenium.Keys;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(sumOfDigits(9));
		//printNum(25);
		//System.out.println(revNum(955, 0));
		revString("CHAITANYA");
	}
	public static int sumOfDigits(int n) {
		if(n<=0)
			return 0;
		return(n%10 + sumOfDigits(n/10));
	}
	
	public static void printNum(int n) {
		if(n==0)
			return;
		printNum(n-1);
		System.out.println(n);
		
	}
	public static int revNum(int n, int m) {
		//int m = 0;
		if(n<=9)
			return n;
		m = (m*10) + (n%10);
		revNum(n/10, m);
		return m;
	}
	public static void revString(String st) {
		char[] arr = st.toCharArray();
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]);
			//Keys.chord(Keys.CONTROL, Keys.ENTER);
		}
	}
}
