package learning;

import java.util.*;

public class Problems {
	
	public void printNames() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array size");
		int size = sc.nextInt();
		String names[] = new String[size];
		
		System.out.println("Enter your array values");
		for (int i = 0; i < names.length; i++) {
			names[i] = sc.next();
		}
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("The names is at index " + (i+1) + " is " + names[i]);
		}	
	}

	public void IntgerMinMax() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array size");
		int size = sc.nextInt();
		int numbers[] = new int[size];
		
		System.out.println("Enter your array values");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) 
				min = numbers[i];
			if (numbers[i] > max)
				max = numbers[i];
		}
		System.out.println(min);
		System.out.println(max);	
	}
	
	public boolean checkSorted() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array size");
		int size = sc.nextInt();
		int numbers[] = new int[size];
		
		System.out.println("Enter your array values");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		
		boolean isAssending = true;
		for (int i = 0; i < numbers.length-1; i++) {
			if (numbers[i] > numbers[i+1]) 
				isAssending = false;	
		}
		return isAssending;		
	}
	
	public void twoDArray() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your rows & column size");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int [][] numbers = new int[row][col];
		
		System.out.println("Enter your array values");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter your X value to search");
		int X = sc.nextInt();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] == X)
				System.out.print("The X found at (" + i + "," + j + ")");
			}	
		}
	}
	
//	---------------------------------- Strings ------------------------ 
	
	public void checkStringLength() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array size");
		int size = sc.nextInt();
		String cars[] = new String[size];
		
		int tolength = 0;
		System.out.println("Enter your array values");
		for (int i = 0; i < cars.length; i++) {
			cars[i] = sc.next();
			tolength += cars[i].length();
		}
		System.out.println(tolength);
	}
	
	public void replaceString() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String result = "";
		 
		for(int i = 0; i < input.length(); i++) {		
			if (input.charAt(i) == 'e') {
				result += 'i';	
			} else {
				result += input.charAt(i);
			}
		}
		System.out.println(result);
	}
	
	public void deleteString() {
		
		//1 Approach
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String userName = "";
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '@')
			break;
			else 
				userName += input.charAt(i);
		}
		System.out.println(userName);
		
		//2 Approach NOT CORRECT
		try {
			int strEnd = input.indexOf('@');
			String result = input.substring(0, strEnd);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("The given string is not Valid" + e);
		}	
	}
	
//	---------------------------------- StringBuilder --------------------- 
	
public void reverseString() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String userName = "";
		
		for (int i = input.length()-1; i >= 0; i--) {
			userName += input.charAt(i);
		}
		System.out.println(userName);
}

public void reverseStringuilder() {
	
	StringBuilder sb = new StringBuilder("Hello");
	
	for (int i = 0; i < sb.length()/2; i++) {
		int front = i;
		int back = sb.length()-i-1;  //5-0-1 => 4
		
		char frontChar = sb.charAt(front);
		char backChar = sb.charAt(back);
		
		sb.setCharAt(front, backChar);
		sb.setCharAt(back, frontChar);
		
	}
	System.out.println(sb);
}

public void replaceStringBuilder() {
	
	StringBuilder sb = new StringBuilder("eabcdef");
	for (int i = 0; i < sb.length(); i++) {
		if (sb.charAt(i) == 'e') {
			sb.setCharAt(i, 'i');	
		}	
	}
	System.out.println(sb);
}

public void deleteStringBuilder() {
	
	StringBuilder sb = new StringBuilder("apnaCollege@gmail.com");
	String userName = "";
	for (int i = 0; i < sb.length(); i++) {
		if (sb.charAt(i) == '@') {
			break;
		} else {
			userName += sb.charAt(i);
		}	
	}
	System.out.println(userName);
}
	
}
