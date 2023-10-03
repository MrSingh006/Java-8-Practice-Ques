package com.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeOne {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(55);
		list.add(14);
		list.add(68);
		list.add(9);
		list.add(5);
		list.add(66);

//		filterExample(list);
//		mapExample(list);
//		countMethod(list);
//		sortedMethod(list);
//		minMethod(list);
//		maxMethod(list);
//		forEachMethod(list);
//		toArrayMethod(list);
		streamOfMethod();
	}


	private static void filterExample(ArrayList<Integer> list) {
		IntPredicate p =i->i%2==0;
		List<Integer> filterList = list.stream().filter(p::test).collect(Collectors.toList());
		filterList.stream().forEach(System.out::println);
	}

	private static void mapExample(ArrayList<Integer> list) {
		Function<Integer,Integer> f =i->i*2;
		List<Integer> mapList = list.stream().map(f::apply).collect(Collectors.toList());
		mapList.stream().forEach(System.out::println);
	}
	
	private static void countMethod(ArrayList<Integer> list) {
		Long count = list.stream().filter(i->i>20).count();
		System.out.println(count);
	}
	private static void sortedMethod(ArrayList<Integer> list) {
		List<Integer> sortedList =list.stream().sorted().collect(Collectors.toList());
		sortedList.stream().forEach(System.out::println);
		
		System.out.println();
		//customSorting
		List<Integer> customSortedList = list.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		customSortedList.stream().forEach(System.out::println);
	}
	
	private static void minMethod(ArrayList<Integer> list) {
		Integer min = list.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);
	}
	
	private static void maxMethod(ArrayList<Integer> list) {
		Integer max = list.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(max);
	}
	
	private static void toArrayMethod(ArrayList<Integer> list) {
		Integer[] arr = list.stream().toArray(Integer[]::new);
		Arrays.stream(arr).forEach(System.out::println);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void streamOfMethod() {

		Stream<Integer> s = Stream.of(3, 4, 2, 6, 43, 2, 52, 22);
		s.forEach(System.out::println);
	}
}
