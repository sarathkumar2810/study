package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.jasper.tagplugins.jstl.core.Set;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);
		
		System.out.println("Hello Spring Boot");
		// if you want to access a class you need to create an object
//		Alien a = new Alien();
//		a.setName("Sarath");
//		System.out.println(a.getName());
		
//		Alien a = context.getBean(Alien.class);
//		a.run();
		
		List<Student> obj = new ArrayList<>();
		ArrayList<String> obj1 = new ArrayList<>();
		obj1.add("sarath");
		obj1.add("raj");
		obj1.add("deva");
		obj1.add("balu");
		Iterator<String> value = obj1.iterator();
		while (value.hasNext()) {
			System.out.println(value.next());
		}
 		obj.add(new Student(1, "Sarath", 26));
		obj.add(new Student(3, "Raj", 32));
		obj.add(new Student(2, "Abas", 21));
		System.out.println(obj); 
		
//		Comparator<Student> com = new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				if (o1.getAge() > o2.getAge()) {
//					return 1;
//				} else {					
//					return -1;
//				}
//			}	
//		};
	
		Collections.sort(obj);
		
		for(Student o: obj) {
			System.out.println(o); 	
		}
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(8);
		list.add(4);
		list.add(9);
		list.forEach(n -> System.out.println(n * 2));
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Vector<String> vec = new Vector<>();
		vec.addElement("Aryan");
		vec.addElement("cavin");
		vec.addElement("raju");
		vec.addElement("malik");
		vec.addElement("raju");
		vec.insertElementAt("balu", 2);
		
		System.out.println(vec);
		
		Queue<Integer> que = new PriorityQueue<>();
		que.add(33);
		que.add(23);
		que.add(42);
		que.add(65);
		
		System.out.println(que);
		
		HashSet<String> hsset = new HashSet<String>();
		hsset.add("B");
		hsset.add("B");
		hsset.add("C");
		hsset.add("A");
		 System.out.println(hsset);
		 for (String hs : hsset) {	 
			 System.out.print(hs + ", ");
			 System.out.println();
		 }
	        
	     LinkedHashSet<String> lhs = new LinkedHashSet<>();
	     lhs.add("India");
	     lhs.add("Australia");
	     lhs.add("South Africa");
	     lhs.add("India");
	     System.out.println(lhs.size());
	     Iterator<String> it = lhs.iterator();
	     while(it.hasNext()) {
	    	 System.out.println(it.next());
	     } 
	     
	     TreeSet<String> ts = new TreeSet<>();
	     ts.add("India");
	     ts.add("Australia");
	     ts.add("South Africa");
	     ts.add("India");
	     Iterator<String> itr = ts.iterator();
	     while(itr.hasNext()) {
	    	 System.out.println(itr.next());
	     }
	     
	     Hashtable<Integer, String> ht = new Hashtable<>(); //null not allowed
	     ht.put(134, "english");
	     ht.put(544, "tamil");
	     ht.put(234, "maths");
	     ht.put(645, "science");
	     ht.put(321, "social");
	     System.out.println(ht);
	     
	     HashMap<Integer, String> hm = new HashMap<>();
	     hm.put(134, "english");
	     hm.put(544, "tamil");
	     hm.put(234, "maths");
	     hm.put(645, "science");
	     hm.put(321, "social");
	     hm.put(435, null);
	     hm.put(null, null);
	     System.out.println(hm);
	     
	     LinkedHashMap<Integer, String> lhp = new LinkedHashMap<>();
	     lhp.put(134, "english");
	     lhp.put(544, "tamil");
	     lhp.put(234, "maths");
	     lhp.put(645, "science");
	     lhp.put(321, "social");
	     lhp.put(435, null);
	     lhp.put(null, null);
	     System.out.println(lhp);
	     
	     TreeMap<Integer, String> tm = new TreeMap<>();
	     tm.put(134, "english");
	     tm.put(544, "tamil");
	     tm.put(234, "maths");
	     tm.put(645, "science");
	     tm.put(321, "social");
	     tm.put(435, null);
	     System.out.println(tm);
	     
	     //Streams
	     
	     List<Integer> number = Arrays.asList(2,3,4,5);
	     System.out.println(number);
	     Stream<Integer> s1 = number.stream();
	     Stream<Integer> s2 = s1.filter(f -> f %2 == 0);
	     Stream<Integer> s3 = s2.map(m -> m * 2); 
	     Integer s4 = s3.reduce(0, (c,e) -> c + e); 
	     System.out.println(s4);
	     
	     int r = number.stream().filter(n -> n %2 == 0).map(n -> n * 2).reduce(0, (c,e) -> c + e);
	     System.out.println(r);
	     
	     //to flat an array
	     List<Integer> list1 = Arrays.asList(1,2,3,4);
	     List<Integer> list2 = Arrays.asList(5,6,7,8);
	     
	     List<List<Integer>> list3 = Arrays.asList (list1, list2);
	     List<Integer> s5 = list3.stream()
	     					.flatMap(li -> li.stream())
	     					.collect(Collectors.toList());
	     
	     System.out.println(s5);
	     
	     List<Integer> s6 = new ArrayList<>();
	     for (int i = 0; i < list1.size(); i++) {
	    	 s6.add(list1.get(i));
	     }
	     for (int j = 0; j < list2.size(); j++) {
	    	 s6.add(list2.get(j));
	     }
	     System.out.println(s6); 
	     
	     List<String> stList = Arrays.asList("one", "two", "three", "four");
	 	
			List<String> s7 = stList.stream()
				.filter(e -> e.length() > 3)
				.peek(e -> System.out.println("Filtered value: " + e))
				.map(String::toUpperCase)
				.peek(e -> System.out.println("Mapped value: " + e))
				.collect(Collectors.toList());
			
			System.out.println(s7);
			
			ArrayList<String> newArr = new ArrayList<>();
			if (newArr.isEmpty()) {
				System.out.println("in Array");
			} else {
				System.out.println("out Array");
			}
			
			System.out.println("----------------------Spring Boot Stream--------------------------------");
			
			 List<List<String>> listOfLists = Arrays.asList(
			            Arrays.asList("Reflection", "Collection", "Stream"),
			            Arrays.asList("Structure", "State", "Flow"),
			            Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
			        );
//			 System.out.println(listOfLists.stream().filter(f -> f.startsWith("S")).map(String::toUpperCase).toList());
			 List<String> result = listOfLists.stream()
					 				.flatMap(List::stream)
					 				.filter(s -> s.startsWith("S"))
					 				.map(String::toUpperCase)
					 				
					 				.sorted()
//					 				.peek(s -> intermediateResults.add(s))
					 				.collect(Collectors.toList());
			 System.out.println(result);
	    }

}
