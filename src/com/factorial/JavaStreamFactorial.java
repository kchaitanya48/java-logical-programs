package com.factorial;

import java.util.stream.IntStream;

public class JavaStreamFactorial {
	
	public static void main(String[] args) {
		int c=IntStream.rangeClosed(1, 5).reduce(1,(a,b)->a*b);
		
		System.out.println(c);
	}

}
