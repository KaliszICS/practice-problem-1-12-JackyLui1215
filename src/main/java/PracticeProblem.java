/**
 * File: Converting Data Types
 * Author: Jacky Lui
 * Date Last Modified: Mar 4, 2026
 */

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String integer = input.nextLine();
		int integer1 = Integer.parseInt(integer);
		System.out.println(integer1 + 3);



	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		String number = input.nextLine();
		number = (number + 4);
		double number1 = Double.parseDouble(number);
		System.out.println(number1 + 2);
	



	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a radius: ");
		String radius = input.nextLine();
		double radius1 = Double.parseDouble(radius);
		radius1 = 3.14 * (Math.pow(radius1, 2));
		System.out.println(radius1);

	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		String number = input.nextLine();
		double number1 = Double.parseDouble(number);
		number1 = (number1 * 12);
		System.out.println(Math.floor(number1));
	}

}
