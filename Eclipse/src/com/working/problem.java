package com.working;

import java.util.Collections;
import java.util.PriorityQueue;

public class problem {
	
	 public static int kthSmallest(int[] arr, int k) {
	        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	        for(int val : arr){
	            pq.add(val);
	            if(pq.size() > k) pq.poll();
	        }
	        System.out.println(pq); 
	        return pq.poll();
	    }
	 
	 public static void merge(int[] arr, int n) {
		 for(int i = 0; i < n-1; i++) {
			 for (int j = 0; j < n-i-1; j++) {
				 if (arr[j] > arr[j+1]) {
					 int temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = temp;
				 }
			 }
		 }
		 
		 for(int val : arr){
			 System.out.print(val + " ");
		 }
	 }
	 
	 public static int doUnion(int arr1[], int arr2[]) {
	        // Your code here
	        int c = 0;
	        for (int i = 0; i < arr1.length; i++) {
	            for (int j = 0 ; j < arr2.length; j++) {
	                if (arr1[i] == arr2[j]) {
	                    c++;
	                }
	            }
	        }
	        
	        System.out.println(c);
	        
	        int res = ((arr1.length + 1 + arr2.length + 1) - c);
	        return res;
	    }
	
	public static void main(String[] args) {
		int k = 3;
		 int[] arr = {7, 10, 4, 3, 20, 15};
		 int val = kthSmallest(arr, 5);
		 System.out.println(val);
		 merge(arr, arr.length);
		 int[] a1 = {1,2,3,4,5};
		 int[] a2 = {1,2,3};
		 int valu = doUnion(a1, a2);
		 System.out.println(valu);
	}

	   
	
	    

}
