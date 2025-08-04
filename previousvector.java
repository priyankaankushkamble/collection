package org.techhub;

import java.util.*;

public class previousvector {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);

		ListIterator li = v.listIterator(v.size());
		while (li.hasPrevious()) {
			Object previous = li.previous();
			System.out.println(previous);
		}

	}

}
