package com.reverse;

import java.util.Arrays;

public class WordReverse {

	static void method1(String value) {

		String ss = Arrays.asList(value.split(" ")).stream().reduce(" ", (a, b) -> b + " " + a, (a, b) -> a + b);
		System.out.println(ss);
	}
	
	public static void main(String[] args) {
		method1("Hello Krishna How are you and where are you?");
	}

}
