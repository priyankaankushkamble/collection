package org.techhub;

import java.util.*;

public class TestDSOperationApp {

	public static void main(String[] args) {
		List list = Arrays.asList(5, 6, 7, 8, 29, 56);
		System.out.println("Before Perform Operation");
		for (Object obj : list) {
			System.out.print(obj + "\t");
		}
		// Perform Reverse
		Collections.reverse(list);
		System.out.println("\n After Reverse");
		for (Object obj : list) {
			System.out.print(obj + "\t");
		}
		// Perform Sorting Operation
		Collections.sort(list);
		System.out.println("\n After Sorting");
		for (Object obj : list) {
			System.out.print(obj + "\t");
		}
		Object maxValue = Collections.max(list);
		System.out.println("\n Max value from collections " + maxValue);
		Object minValue = Collections.min(list);
		System.out.println("\n Min Value From Collection " + minValue);

	}

}
