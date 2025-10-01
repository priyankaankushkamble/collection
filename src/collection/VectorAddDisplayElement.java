package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorAddDisplayElement {

	public static void main(String[] args) {

		Vector<Integer> v=new Vector();
		v.add(50);
		v.add(100);
		v.add(150);
		v.add(200);
		v.add(250);
		v.add(300);
		v.add(350);
		v.add(400);
		v.add(450);
		v.add(500);
		
		System.out.println("Element in vector is:");
		Iterator<Integer> itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+ "\t");
		}
	}

}
