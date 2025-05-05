package com.calculator;

import java.util.InputMismatchException;
//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try {
			while (true) {
				boolean isvalide = true;
				System.out.println("Enter 1 to add");
				System.out.println("Enter 2 to subtract");
				System.out.println("Enter 3 to multiply");
				System.out.println("Enter 4 to divide");
				System.out.println("Enter exit");
				Scanner scan = new Scanner(System.in);
				String choices = scan.next();
				if (choices.equals("exit")) {
					System.out.println("program exit");
					break;
				} else if (choices.equals("1") || choices.equals("2") || choices.equals("3") || choices.equals("4")) {

				} else {
					System.out.println("Invalide Entry");
					isvalide = false;
				}
				while (isvalide) {
					double choice = Double.parseDouble(choices);
					double num1 = 0.0;
					double num2 = 0.0;
					System.out.println("Enter 0 to go back");
					if ((choice == 2) || (choice == 4)) {
						System.out.println("Enter first number");
						num1 = scan.nextDouble();
						if (num1 == 0) {
							break;
						}

						System.out.println("Enter Secound Number");
						num2 = scan.nextDouble();
					}
					if (choice == 0) {
						break;
					} else if (choice == 1) {
						System.out.println("Number of Inputs to add");
						int n = scan.nextInt();
						System.out.println(add(n, scan));
						break;
					} else if (choice == 2) {
						System.out.println(sub((int) num1, (int) num2));
						break;
					} else if (choice == 3) {
						System.out.println("Number of Inputs to multiple");
						int n = scan.nextInt();
						System.out.println(mul(n, scan));
						break;
					} else if (choice == 4) {
						System.out.println(div(num1, num2));
						break;
					} else {
						System.out.println("invalid entry");
						break;
					}
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("input mismatch" + e);
		}

	}

	public static int add(int no1, Scanner scan) {
		int sum = 0;
		for (int i = 1; i <= no1; i++) {
			System.out.println("Enter Number : " + i);
			int num = scan.nextInt();
			sum += num;
		}
		return sum;
	}

	public static int sub(int no1, int no2) {
		int sum = no1 - no2;
		return sum;
	}

	public static double mul(int no1, Scanner scan) {
		int sum = 1;
		for (int i = 1; i <= no1; i++) {
			System.out.println("Enter Number : " + i);
			int num = scan.nextInt();
			sum *= num;
		}
		return sum;
	}

	public static double div(double no1, double no2) {
		double sum = no1 / no2;
		return sum;
	}
}
