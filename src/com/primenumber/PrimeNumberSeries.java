package com.primenumber;

import java.util.stream.IntStream;

public class PrimeNumberSeries {
	
	static boolean isPrime(int numb) {
		
		return !IntStream.rangeClosed(2, numb/2).anyMatch(e->numb%e==0);
	}
	
	public static void main(String[] args) {
		
		//isPrime(11);
		IntStream.iterate(0,t->t+1).limit(12).filter(PrimeNumberSeries::isPrime).peek(System.out::println).count();
		
	}

}
