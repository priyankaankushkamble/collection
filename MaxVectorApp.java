package org.techhub;

import java.util.*;

public class MaxVectorApp {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(100);
		v.add(29);
		v.add(40);
		v.add(200);

		Iterator i = v.iterator();
		int max = 0;
		while (i.hasNext()) {
			Object obj = i.next();
			if ((int) obj > max) {
				max = (int) obj;
			}

		}
		System.out.println("Maximum Number is:" + max);

	}

}
