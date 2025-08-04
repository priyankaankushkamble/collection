package org.techhub;

import java.util.*;

public class HashSetApplication {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(50);
		hs.add(9);
		hs.add(12);
		hs.add(29);
		hs.add(52);
		hs.add(42);
		hs.add(23);
		hs.add(24);
		hs.add(2);
		for (Object obj : hs) {
			System.out.println(System.identityHashCode(obj) + "\t" + obj);
		}

	}

}
