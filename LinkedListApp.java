package org.techhub;
import java.util.*;
public class LinkedListApp {

	public static void main(String[] args) {
		LinkedList lst=new LinkedList();
		lst.add(100);
		lst.add(200);
		lst.add(300);
		lst.add(400);
		
		for(Object obj:lst) {
			Integer val=(Integer)obj;
			System.out.println(val);
		}

	}

}
