package com.findduplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicate {

	static void findDuplicateCharactersInString(String value) {
		value.chars().mapToObj(e -> (char) e).filter(e -> e != ' ')
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).forEach(a -> System.out.println(a.getKey() + " " + a.getValue()));
	}

	static void findDuplicateCharactersInStringmaxRepated(String value) {
		Entry<Character, Long> entry = value.chars().mapToObj(e -> (char) e).filter(e -> e != ' ')
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.max((m1, m2) -> m1.getValue().intValue() - m2.getValue().intValue()).get();

		System.out.println(entry);
		System.out.println("max repeated beforeValue" + value.charAt(value.lastIndexOf(entry.getKey()) - 1));
	}

	
	static void findCountOfDuplicateFromIntegerArrayEx1(List<Integer> a) {

		a.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.forEach(e -> System.out.println(e.getKey() + " --" + e.getValue()));

	}

	static void findCountOfDuplicateFromIntegerArrayEx2(int[] a) {

		Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.forEach(e -> System.out.println(e.getKey() + " --" + e.getValue()));

	}
	
	static void removeDuplicatesIntegerUsingStream(int[] a) {
		Arrays.stream(a).boxed().collect(Collectors.toSet()).forEach(System.out::println);
	}
	static void findDuplicatesIntegerUsingStream(int[] a) {
		Set<Integer> ss=new HashSet<>();
		Arrays.stream(a).boxed().filter(n->!ss.add(n)).distinct().forEach(System.out::println);
		
		
	}

	public static void main(String[] args) {
		findDuplicateCharactersInStringmaxRepated("Hello Krishna How are you and where are you?");
	}

}
