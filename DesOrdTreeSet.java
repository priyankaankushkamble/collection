package org.techhub;

import java.util.*;

public class DesOrdTreeSet {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(300);
		ts.add(34);
		ts.add(21);
		ts.add(244);
		ts.add(21);
		ts.add(12);
		ts.add(500);
		NavigableSet nav = ts.descendingSet();
		for (Object obj : nav) {
			System.out.println(obj);
		}

	}

}
