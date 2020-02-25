package com.spacejava;

import java.util.Scanner;

public class welcomeClass {

	public static void main(String[] args) {
//		 This is our first step to git and very first Program
		
		String first_name;
		String last_name;
		Scanner data = new Scanner(System.in);
		System.out.print("Please Enter your First Name : ");
		first_name = data.nextLine();
		System.out.println("Your second Name : ");
		last_name = data.nextLine();
		System.out.println(" Welcome Here : "+first_name+" "+last_name);
		

	}

}
