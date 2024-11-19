package com.working;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice {
	
	public static void largest(int[] arr) {
		int large = 0;
		int small = arr[0];
		for (int a : arr) {
			if(large < a) {
				large = a;
			}
			if (small > a) {
				small = a; 
			}
		}
		System.out.println(large);
		System.out.println(small);
	}
	
	public static void moveZeros(int[] arr) {
		int count = 0;
		ArrayDeque<Integer> newList = new ArrayDeque<Integer>();
		for (int i : arr) {
			if (i == 0) {
				count++;
			} else {
				newList.add(i);
			}
		}	
		while(count > 0) {
			newList.addFirst(0);
			count--;
		}
		System.out.println(newList);
	}
	
	public static void reverseArray(int[] arr) {
 		ArrayList<Integer> newArr = new ArrayList<Integer>();
		for(int i = arr.length-1; i >=0; i--) {
			newArr.add(arr[i]);
		}
		System.out.println(newArr);	
	}
	
	public static Map.Entry<String, Integer> getNthOrder(int num, Map<String, Integer> map) {
		return map.entrySet().stream()
		.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
		.collect(Collectors.toList())
		.get(num);
	}
	
	public static Entry<Integer, List<String>> getDynamicNthOrder(int num, Map<String, Integer> map) {
		return  map.entrySet().stream()
				.collect(Collectors.groupingBy(Map.Entry::getValue, 
				Collectors.mapping(Map.Entry::getKey, 
				Collectors.toList())))
				.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
				.collect(Collectors.toList())
				.get(num);
	}
	
	public static void perum(String str, String newStr, int num) {
		
		if (str.length() == 0) {
			System.out.println(newStr);
			return;
		}
		
		for (int i = 0; i < str.length(); i++) {
			char currChar = str.charAt(i);
			String st = str.substring(0,i) + str.substring(i+1);
			perum(st, currChar+newStr, num+1);
		}
		
	}
	
	public static void maxElement() {
		int[] array = {1, 5, 8, 7, 2};
        int max = array[0];
        for (int num : array) {
           if (max < num) {
                max = num;
            }
        }
        System.out.println("Maximum element: " + max);
	}
	
	public static void reverseArray() {
		int[] array = {1, 2, 3, 4, 5};
		int start = 0;
		int end = array.length-1;
		while(start < end) {
			int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
		}
		 System.out.println("Reversed array: " + Arrays.toString(array));
	}
	
	public static void containArray() {
		int[] array = {1, 2, 3, 4, 5};
		int value = 3;
		boolean found = false;
		for (int a : array) {
			if (a == value) {
				 found = true;
				break;
			}
		}
		   System.out.println("Value " + value + " found: " + found);
	}
	
	public static void removeDup() {
		int[] array = {1, 2, 3, 2, 4, 5, 1};
		Set<Integer> value = new HashSet<Integer>();
		for (int a : array) {
			value.add(a);
		}
		System.out.println(value);
	}
	
	public static int[] Sorting(int[] arr) {
		for (int i = 0; i < arr.length; i++) {  
            for (int j = i + 1; j < arr.length; j++) {  
                int tmp = 0;  
                    if (arr[i] > arr[j]) {  
                    tmp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = tmp;  
                }  
                }       
        }
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {2,4,18,9,1,3};
		largest(arr);
		moveZeros(new int[] {-4, 1, 0, 0, 2, 21, 4});
		reverseArray(new int[]{4, 5, 8, 9, 10});
	
	Map<String, Integer> listEmp = new HashMap<String, Integer>();
	listEmp.put("Anil", 1000);
	listEmp.put("Raj", 1000);
	listEmp.put("bavana", 1500);
	listEmp.put("tom", 1500);
	listEmp.put("Ankit", 1500);
	listEmp.put("daniel", 1700);
	listEmp.put("james", 1700);
	
	Map.Entry<String, Integer> result = getNthOrder(1, listEmp);
	Entry<Integer, List<String>> result1 = getDynamicNthOrder(1, listEmp);
	System.out.println(result);
	System.out.println(result1);
	
	maxElement();
	reverseArray();
	containArray();
	removeDup();
	int[] arr233 = {7,10,4,3,20,15};
	int[] newarr = Sorting(arr233);
	for (int a : newarr) {
		System.out.println(a);
	}
	}
}
