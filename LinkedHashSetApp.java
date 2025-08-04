package org.techhub;

import java.util.*;

public class LinkedHashSetApp {

	public static void main(String[] args) {
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		hs.add(100);
		hs.add(200);
		hs.add(5);
		hs.add(100);
		hs.add(5);
		hs.add(400);
		for(Integer obj : hs) {
			System.out.println(obj);
		}
	}
}