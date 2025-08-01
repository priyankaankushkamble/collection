package org.techhub;

import java.util.*;

public class SortingWithoutSortMethod {

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(3);
		v.add(40);
		v.add(5);
		System.out.println("Vector before sorting");
		Iterator itr = v.iterator();
		while (itr.hasNext()) {
			Object obj = itr.next();
			System.out.print(obj + "\t");
		}
		int len = v.size();
		for (int i = 0; i < len; i++) {
			for (int j = (i + 1); j < len; j++) {
				Object prev = v.get(i);
				Object next = v.get(j);
				if ((int) prev > (int) next) {
					v.set(i, next);
					v.set(j, prev);
				}
			}
		}
		System.out.println("\nVector After sorting");
		itr = v.iterator();
		while (itr.hasNext()) {
			Object obj = itr.next();
			System.out.print(obj + "\t");
		}
	}
}
