package com.itt.constrouctorexample;

public class Stuff {
	static int count = 0;

	public Stuff() {
		count = count + 1;
		System.out.println("created object number =  " + count);
	}
}
