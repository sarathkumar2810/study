package com.working;

public class work {
	
	public static void rotate(int[] arr) {
        // code here
        int r=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
        System.out.println(arr[i]); 
          arr[i+1]=arr[i];
        }
        arr[0]=r; 
        
        for (int a : arr) {
        	System.out.print(a + " ");
        }
    }
	
	public static void main(String[] args) {
		int[] arr= {9, 8, 7, 6, 4, 2, 1, 3};
		rotate(arr);
		
	}

}
