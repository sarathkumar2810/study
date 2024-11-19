package com.working;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class sumArray {

	public static void main(String[] args) {
		int[] in = {2,3,4,5,7};
		int sum = Arrays.stream(in).sum();
		System.out.println(sum);
		
		List<Integer> inp =  Arrays.asList(1,2,3,4,5);
		Optional<Integer> val = inp.stream().reduce((a,b)-> a+b);
		System.out.println("The Output is "+ val.get());
		double val1 = inp.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println("The average is "+ val1);
		
		List<Integer> inpu =  Arrays.asList(1,10,20,30,15);
		List<Integer> newlist = inpu.stream()
				.map(e -> e*e)
				.filter(f -> f > 100)
				.collect(Collectors.toList());
		System.out.println(newlist);
		
		List<Integer> input =  Arrays.asList(11,2,3,45,6,9,90,87,8,5);
		List<Integer> evenVal = input.stream().filter(e->e%2!=0).collect(Collectors.toList());
		System.out.println(evenVal);
		
		List<Integer> input1 =  Arrays.asList(2,222,234,567,890,432,234,211,22);
		List<Integer> evenVal1 = input1.stream().map(e -> String.valueOf(e))
		.filter(e -> e.startsWith("8"))
		.map(e -> Integer.parseInt(e))   //(Integer::valueOf)
		.collect(Collectors.toList());
		
		System.out.println(evenVal1);
		
		List<Integer> input2 =  Arrays.asList(1,3,10,20,30,15,-1,13,1,2,2,10,30,19,3);
		TreeSet<Integer> filterMap = new TreeSet<Integer>();
		Iterator<Integer> it = input2.iterator();
		while(it.hasNext()) {
			filterMap.add(it.next());
		}
		System.out.println(filterMap);
		
		Set<Integer> out = input2.stream().filter(e -> Collections.frequency(input2, e)>1)
		.collect(Collectors.toSet());
		System.out.println(out);
		
		Set<Integer> dupNum = new HashSet<Integer>();
		Set<Integer> out1 = input2.stream().filter(e-> !dupNum.add(e)).collect(Collectors.toSet());
		System.out.println(out1);
		
		int max = input2.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);
		
		int min = input2.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min);
		
		List<Integer> arr = input2.stream()
				.sorted(Comparator.comparing(Integer::valueOf))
				.collect(Collectors.toList());
		
		List<Integer> arr1 = input2.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println(arr);
		System.out.println(arr1);
		
	}

}
