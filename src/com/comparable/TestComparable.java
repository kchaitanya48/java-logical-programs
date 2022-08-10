package com.comparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestComparable {


	
	public static void main(String[] args) {
		
		Employee emp1=new Employee.EmployeeBuilder(1)
				.setFirstName("krishna")
				.setLastName("chaitanya")
				.setAge(25)
				.setSalary(1344.4)
				.setCity("PragathiNagar")
				.setState("Telangana")
				.build();
		
		Employee emp2=new Employee.EmployeeBuilder(1)
				.setFirstName("swetha")
				.setLastName("mounika")
				.setAge(22)
				.setSalary(2316.23)
				.setCity("kukatpally")
				.setState("Telangana")
				.build();
		
		Employee emp3=new Employee.EmployeeBuilder(1)
				.setFirstName("sarath")
				.setLastName("bhusarapu")
				.setAge(30)
				.setSalary(2316.32)
				.setCity("bhimavaram")
				.setState("hyderabad")
				.build();
		
		
		Employee emp4=new Employee.EmployeeBuilder(1)
				.setFirstName("kiran")
				.setLastName("teja")
				.setAge(35)
				.setSalary(2443.7)
				.setCity("bhimavaram")
				.setState("hyderabad")
				.build();
		
		Employee emp5=new Employee.EmployeeBuilder(1)
				.setFirstName("krishna")
				.setLastName("prasad")
				.setAge(24)
				.setSalary(1344.4)
				.setCity("PragathiNagar")
				.setState("Telangana")
				.build();

		List<Employee> empList = Arrays.asList(new Employee[] { emp1, emp2, emp3, emp4, emp5 });
		// single Comparator
		empList.stream().sorted((e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()))
				.forEach(System.out::println);
		

		// multiple Comparator

		System.out.println("---------------");
		System.out.println("---------------");

		Comparator<Employee> empComparator = Comparator.comparing(Employee::getFirstName)
				.thenComparing(Employee::getAge);
		empList.stream().sorted(empComparator).forEach(System.out::println);
		

		// multiple Comparator

		System.out.println("---------------");
		System.out.println("---------------");

		Comparator<Employee> empComparator1 = Comparator.comparing(Employee::getFirstName)
				.thenComparing(Employee::getAge).thenComparing(Employee::getSalary);
		empList.stream().sorted(empComparator1).forEach(System.out::println);
		
	}
}
