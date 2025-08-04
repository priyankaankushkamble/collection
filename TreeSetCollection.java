package org.techhub;

import java.util.*;

public class TreeSetCollection {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(5);
		ts.add(3);
		ts.add(2);
		ts.add(588);
		ts.add(105);
		ts.add(244);

		for (Object obj : ts) {
			System.out.println(obj);
		}
	}

}
