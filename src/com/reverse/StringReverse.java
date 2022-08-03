package com.reverse;

public class StringReverse {

	static void method1(String value) {
		char[] ch=value.toCharArray();
		int n=ch.length;
		
		for(int i=0;i<n/2;i++) {
			char temp='0';
			temp=ch[i];
			ch[i]=ch[n-i-1];
			ch[n-i-1]=temp;
			
		}
		
		System.out.println(String.valueOf(ch));
	}
	

	static void method2(String value) {
		System.out.println(value.chars().mapToObj(e->(char)e).reduce("",(a,b)->b+a,(a,b)->a+b));
	}
	
	public static void main(String[] args) {
		method2("krishna");
	}
	
}
