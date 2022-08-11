package com.java8.streams.mapconversion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.comparable.Employee;

public class MapConversion {



	
	public static void main(String[] args) {
		
		Employee emp1=new Employee.EmployeeBuilder(1)
				.setFirstName("krishna")
				.setLastName("chaitanya")
				.setAge(25)
				.setSalary(1378.58)
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
				.setSalary(2816.32)
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
				.setAge(39)
				.setSalary(3344.4)
				.setCity("Shamshabad")
				.setState("Telangana")
				.build();
		
		Employee emp6=new Employee.EmployeeBuilder(1)
				.setFirstName("rajesh")
				.setLastName("arvind")
				.setAge(38)
				.setSalary(3542.4)
				.setCity("Bangalore")
				.setState("Karnataka")
				.build();
		
		Employee emp7=new Employee.EmployeeBuilder(1)
				.setFirstName("venkat")
				.setLastName("swamy")
				.setAge(36)
				.setSalary(2549.58)
				.setCity("PragathiNagar")
				.setState("Telangana")
				.build();
		
		Employee emp8=new Employee.EmployeeBuilder(1)
				.setFirstName("devi")
				.setLastName("sri")
				.setAge(38)
				.setSalary(2744.4)
				.setCity("vijayawada")
				.setState("andharapradesh")
				.build();

		List<Employee> empList = Arrays.asList(new Employee[] { emp1, emp2, emp3, emp4, emp5,emp6,emp7,emp8 });
		
		empList.stream().collect(Collectors.groupingBy(Employee::getAge))
		.entrySet().forEach(d->System.out.println(d.getKey()+" --> "+d.getValue()));;
		
		
	}

}
