package org.techhub;

import java.util.*;

public class AddCursorApp {

	public static void main(String[] args) {
		Vector v = new Vector();

		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);

		ListIterator li = v.listIterator(v.size());
		System.out.println("Before Adding:" + v);
		while (li.hasPrevious()) {

			Object previous = li.previous();
			if ((int) previous == 300) {
				li.add(500);
			}
		}

		System.out.println("After Adding:" + v);

	}

}
