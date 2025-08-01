package org.techhub;

import java.util.*;

public class MinVectorApp {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(67);
		v.add(96);
		v.add(54);
		v.add(44);
		v.add(23);

		Iterator i = v.iterator();
		int min=(int)v.get(0);
		while (i.hasNext()) 
		{
			Object obj = i.next();
			if ((int)obj<min) 
			
			{
				min=(int) obj;
			}
		}
		System.out.println("Minimum Value of Vector is:" + min);
	}

}
