package com.comparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestComparable {

	
	static List<Employee> emp=null;
	
	static {
		Employee emp1=new Employee(122,"krishna");
		Employee emp2=new Employee(141,"swetha");
		Employee emp3=new Employee(112,"chaitanya");
		Employee emp4=new Employee(152,"arvind");
		Employee emp5=new Employee(102,"kiran");
		
		Arrays.asList(new Employee[]{emp1,emp2,emp3,emp4,emp5}).stream().sorted(Comparator.reverseOrder())
		.forEach(a->System.out.println(a.geteId()+" "+a.geteName()));;
				
	}
	
	public static void main(String[] args) {
		
	}
}
