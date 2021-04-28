package com.createiq.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args) {
//		Set<Employee> employees = new HashSet<>();
//		employees.add(new Employee(1001, "Balaji"));
//		employees.add(new Employee(1002, "Raja"));
//		employees.add(new Employee(1001, "Balaji"));
//		
//		System.out.println(employees);
		
//		Integer i = new Integer(20);
//		System.out.println(i.hashCode());
		
		Set<Integer> nums = new HashSet<>();
		nums.add(12);
		nums.add(20);
		nums.add(12);
		nums.add(23);
		nums.add(1);
		nums.add(3);
		nums.add(4);
		nums.add(43);
		
		System.out.println(nums);
	}

}
