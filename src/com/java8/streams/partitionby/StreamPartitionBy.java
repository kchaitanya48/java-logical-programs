package com.java8.streams.partitionby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPartitionBy {
public static void main(String[] args) {
	
	Map<Boolean, List<Integer>> m=IntStream.range(1, 20).boxed().collect(Collectors.partitioningBy(e->e%2==0));
	System.out.println(m);
}
}
