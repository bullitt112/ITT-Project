package com.itt.recursionexample;

public class RecursionExample {
	private static int index = 0;
	private static int stoppingPoint = 40;

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		System.out.println("index = " + index +"-> "+ n1);
		fibonacciSequance(n1, n2);

	}

	public static void fibonacciSequance(int n1, int n2) {
		System.out.println("index = " + index +"-> "+ n2);
		if (index == stoppingPoint)
			return;
		index++;
		fibonacciSequance(n2, n1 + n2);

	}

}
