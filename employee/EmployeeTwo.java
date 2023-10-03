package com.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeTwo {
	static List<Employee> empList = new ArrayList<Employee>();

	public static void main(String[] args) {
		empList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		empList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		empList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		empList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		empList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		empList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		empList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		empList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		empList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		empList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		empList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		empList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		empList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		empList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		empList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		empList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		empList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		// Query 1 : How many male and female employees are there in the organization?
//    method1();
		System.out.println("\n");
		// Query 2 : Print the name of all departments in the organization?
//    method2();
		System.out.println("\n");
		// Query 3 : What is the average age of male and female employees?
//    method3();
		System.out.println("\n");
		// Query 4 : Get the details of highest paid employee in the organization?
//    method4();
		System.out.println("\n");
		// Query 5 : Get the names of all employees who have joined after 2015?
//    method5();
		System.out.println("\n");
		// Query 6 : Count the number of employees in each department?
//    method6();
		System.out.println("\n");
		// Query 7 : What is the average salary of each department?
//    method7();
		System.out.println("\n");
		// Query 8 : Get the details of youngest male employee in the product
		// development department?
//    method8();
		System.out.println("\n");
		// Query 9 : Who has the most working experience in the organization?
//    method9();
		System.out.println("\n");
		// Query 10 : How many male and female employees are there in the sales and
		// marketing team?
//    method10();
		System.out.println("\n");
		// Query 11 : What is the average salary of male and female employees?
//    method11();
		System.out.println("\n");
		// Query 12 : List down the names of all employees in each department?
//    method12();
		System.out.println("\n");
		// Query 13 : What is the average salary and total salary of the whole
		// organization?
//    method13();
		System.out.println("\n");
		// Query 14 : Separate the employees who are younger or equal to 25 years from
		// those employees who are older than 25 years.
//    method14();
		System.out.println("\n");
		// Query 15 : Who is the oldest employee in the organization? What is his age
		// and which department he belongs to?
//    method15();

		method16();
	}

	private static void method16() {
		Map<String, Set<Employee>> m = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toSet()));
		System.out.println(m);
	}

	private static void method12() {
		Map<String, List<Employee>> m = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

		m.forEach((dept, empList) -> {
			System.out.print(dept + "=>");
			empList.stream().map(Employee::getName).forEach(empName -> {
				System.out.print(empName + ",");
			});
			System.out.println();
		});
	}

	private static void method11() {
		Map<String, Double> map = empList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(map);
	}

	private static void method10() {
		Map<String, Long> map = empList.stream().filter(i -> i.getDepartment().equalsIgnoreCase("sales and marketing"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(map);
	}

	private static void method9() {
		Employee e = empList.stream().min((i1, i2) -> Integer.compare(i1.getYearOfJoining(), i2.getYearOfJoining()))
				.get();
		System.out.println(e);
	}

	private static void method8() {
		Employee emp = empList.stream().filter(i -> i.getDepartment().equalsIgnoreCase("product development"))
				.min((i1, i2) -> Integer.compare(i1.getAge(), i2.getAge())).get();
		System.out.println(emp);
	}

	private static void method7() {
		Map<String, Double> map = empList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(map);
	}

	private static void method6() {
		Map<String, Long> map = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(map);
	}

	private static void method5() {
		empList.stream().filter(i -> i.getYearOfJoining() > 2015).map(Employee::getName).forEach(System.out::println);
	}

	private static void method4() {
		Stream<Employee> s = empList.stream().sorted((i1, i2) -> Double.compare(i2.getSalary(), i1.getSalary()))
				.limit(1);
		s.forEach(System.out::println);

		// 2nd approach
		Employee e = empList.stream().max((i1, i2) -> Double.compare(i1.getSalary(), i2.getSalary())).get();

		System.out.println(e);
	}

	private static void method3() {
		Map<String, Double> avgAge = empList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(avgAge);
	}

	private static void method2() {
		empList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
	}

	public static void method1() {
		Map<String, Long> map = empList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(map);
	}

}
