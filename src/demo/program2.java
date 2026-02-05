package demo;

import java.util.Scanner;

public class program2 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String s = sc.next();

	        String temp = "";

	        for(int i = s.length()-1; i >= 0; i--)
	        	temp =temp+ s.charAt(i);

	        if(s.equals(temp))
	            System.out.println("Palindrome");
	        else
	            System.out.println("Not Palindrome");
	    }
}
