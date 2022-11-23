package org.string;

public class Samplestring {

	
	public static void main(String[] args) {
		
		String s="welcome";
		
		System.out.println(s.length());   // number of character in the string
		
		// concatenation
		
		String s1 = "welcome";
		String s2 = " world";
		String s3 = "Welcome";
		
		System.out.println(s1+ s2);
		
		// concat
		
		System.out.println(s1.concat(s2));
		
		//comapre
		
		System.out.println(s1.equals(s3));
		
		boolean b = s1.equalsIgnoreCase(s3);
		System.out.println(b);
		
		boolean b1 = s1.contains("well");
		System.out.println(b1);
		
		System.out.println(s1.substring(2));
		
		System.out.println(s.replace("e", "a"));
	}
	
}
