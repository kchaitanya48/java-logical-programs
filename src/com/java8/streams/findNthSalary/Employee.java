package com.java8.streams.findNthSalary;

public class Employee implements Comparable<Employee> {

	private int eId;
	private String firstName;
	private String lastName;
	private int age;
	private double salary;
	private String city;
	private String state;
	
	
	
	

	private Employee(EmployeeBuilder employeeBuilder) {
		super();
		this.eId = employeeBuilder.eId;
		this.firstName = employeeBuilder.firstName;
		this.lastName = employeeBuilder.lastName;
		this.age = employeeBuilder.age;
		this.salary = employeeBuilder.salary;
		this.city = employeeBuilder.city;
		this.state = employeeBuilder.state;
	}

	static public class EmployeeBuilder {
		private int eId;
		private String firstName;
		private String lastName;
		private int age;
		private double salary;
		private String city;
		private String state;

		public EmployeeBuilder(int eId) {
			super();
			this.eId = eId;
		}

		public EmployeeBuilder setFirstName(final String firstName) {
			this.firstName = firstName;
			return this;
		}

		public EmployeeBuilder setLastName(final String lastName) {
			this.lastName = lastName;
			return this;
		}

		public EmployeeBuilder setAge(final int age) {
			this.age = age;
			return this;
		}

		public EmployeeBuilder setSalary(final double salary) {
			this.salary = salary;
			return this;
		}

		public EmployeeBuilder setCity(final String city) {
			this.city = city;
			return this;
		}

		public EmployeeBuilder setState(final String state) {
			this.state = state;
			return this;
		}
		
		
		public Employee build() {
			return new Employee(this);
		}
		

	}
	
	
	
	
	
	

	public int geteId() {
		return eId;
	}







	public String getFirstName() {
		return firstName;
	}







	public String getLastName() {
		return lastName;
	}







	public int getAge() {
		return age;
	}







	public double getSalary() {
		return salary;
	}







	public String getCity() {
		return city;
	}







	public String getState() {
		return state;
	}







	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.eId - o.eId;
	}







	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", salary=" + salary + ", city=" + city + ", state=" + state + "]";
	}
	
	
	

}
