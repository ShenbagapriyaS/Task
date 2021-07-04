package org.test;

import java.util.Scanner;

public class GitTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your name");
		String name = s.nextLine();
		System.out.println("name is (nextline) =" + name);
		
		System.out.println("enter your age");
		byte age = s.nextByte();
		System.out.println("your age is = " +age);
		
		System.out.println("enter your number");
		long num = s.nextLong();
		System.out.println("your mobile is = " +num);
		
		System.out.println("enter your ac number");
		long acNum = s.nextLong();
		System.out.println("account num = " +acNum );
	}
}
