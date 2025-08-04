package org.techhub;

import java.util.*;

public class foreachmethod {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		al.forEach((val) -> System.out.println(val));

	}

}
