package com.working;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Working {
	
	public static boolean isPrime(int n) {
		  if (n == 0 || n == 1) return false;
		  if (n == 2) return true;
		  for (int i = 2; i <= n/2; i++) {
		    if (n%i == 0) return false;
		  }
		  return true;
		}
	
	public static void reverse() {
		String s = "Rajesh";
		String temp = "";
		  for (int i = s.length()-1; i >= 0; i--) {
		   temp += s.charAt(i);
		  }
		  System.out.println(temp); 
		}
	
	public static boolean vovels(String st) {
		return st.toLowerCase().matches(".*[aeiou].*");
	}
	
	public static void fibonachi() {
		int a = 0;
		int b = 1;
		int c = 1;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(a + ",");
			 a = b;
			b = c;
			c = a + b;
		}
	}
	
	public static boolean palendrom(String st) {
		String org = st;
		String tem = "";
		for(int i = st.length()-1; i >= 0; i--) {
			tem += st.charAt(i);
		}
		if (org.equals(tem)) {
			return true;
		}
		return false;
	}
	
	public static void prymid() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> word = Arrays.asList("java", "program", "php", "R", "Python", "C++");
		long count = word.stream().filter(d -> d.length() >= 3).count();
		System.out.println(count);
		
//		Random rand = new Random();
//		rand.ints(1,100).distinct().limit(10).sorted().forEach(System.out::println);
	
//		int[] num = {1,2,3,4,5,6,7,8,9,10};
//		int val = Arrays.stream(num).filter(f -> f%2 == 0).sum();
//		System.out.println(val);
//		
//		System.out.println(isPrime(5));
//		reverse();
//		
//		System.out.println(vovels("tv"));
//		fibonachi();
//		System.out.println(palendrom("t"));
		
//		prymid();
		
		int[] arr = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
		Emloyee emp1 = new Emloyee(123, "sarath", 45000);
		Emloyee emp2 = new Emloyee(145, "rajesh", 67544);
		Emloyee emp3 = new Emloyee(345, "vinoth", 56744);
		Emloyee emp4 = new Emloyee(544, "pranav", 89000);
		Emloyee emp5 = new Emloyee(435, "zavier", 24546);
		
		List<Emloyee> empList = new ArrayList();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		List<Emloyee> filterEmp = empList.stream()
				.filter(e -> e.salary > 50000)
				.collect(Collectors.toList());
		System.out.println(filterEmp);
		
		List<Double> salEmp = empList.stream()
				.filter(e -> e.salary > 50000)
				.map(m -> m.getSalary())
				.collect(Collectors.toList());
		System.out.println(salEmp);
		
		Iterator<Emloyee> it = empList.iterator();
		while(it.hasNext()) {
//			System.out.println(it.next());
			Emloyee emp = (Emloyee)it.next();
			if (emp.getSalary() > 50000) {
				System.out.println(emp.getSalary());
			}
		}
		
		List<employe> listEmp = new ArrayList<employe>();
		listEmp.add(new employe(101, 500));
		listEmp.add(new employe(102, 1000));
		listEmp.add(new employe(103, 1500));
		listEmp.add(new employe(104, 2000));
		listEmp.add(new employe(105, 2500));
		listEmp.add(new employe(106, 3000));
		listEmp.add(new employe(107, 3500));
		
		List<Long> descList = listEmp.stream()
		.sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary()))
		.map(m->m.getSalary())
		.limit(3)
		.skip(2)
		.collect(Collectors.toList());
				
		System.out.println(descList);
		
		int[] num = {4,5,3,6,8,7};
		int largest = 0;
		for (int n : num) {
			if (largest < n)
				largest = n;
		}
		System.out.println(largest);
		
		int[] inputArray = new int[] {111, 333, 555, 777, 333, 444, 555};
		HashSet<Integer> filterArray = new HashSet<Integer>();
		for (int ia : inputArray) {
			 if( !filterArray.add(ia))
	            {
	                System.out.println("Duplicate Element : "+ia);
	            }
		}
		Set<Integer> uniqueElements = new HashSet<>();
        
        Set<Integer> duplicateElements =  Arrays.stream(inputArray)
                                                .filter(i -> !uniqueElements.add(i))
                                                .boxed()
                                                .collect(Collectors.toSet());
        System.out.println(duplicateElements);
	}

}
