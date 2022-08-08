package com.fibonocci;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamFibonocci {
	
	public static void main(String[] args) {
		List<String> ll=
				Stream.iterate(new int[] {0,1}, t-> new int[] {t[1],t[0]+t[1]})
				.limit(10).map(a->String.valueOf(a[0])).collect(Collectors.toList());
		
		System.out.println(ll);
				
	}

}
