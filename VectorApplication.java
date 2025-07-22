package org.techhub;

import java.util.*;

public class VectorApplication {

	public static void main(String[] args) 
	{
		Vector v=new Vector();
		do {
			Scanner xyz=new Scanner(System.in);
			System.out.println("1:Add New Element in Vector");
			System.out.println("2:View All Element in Vector");
			System.out.println("3:Search Element using Contains method");
			System.out.println("4:Search Element using indexOf method");
			System.out.println("5:Create Sublist or fetch data between two index");
			System.out.println("6:Count total number of element from vector");
			System.out.println("7:Check Vector is empty or not");
			System.out.println("8:Search data of vector using get method");
			System.out.println("Enter your choice");
			int choice=xyz.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the value in vector");
				int value=xyz.nextInt();
				boolean b=v.add(value);
				if(b) {
					System.out.println("Element Added in Collection");
				}
				else
				{
					System.out.println("Some Problem is There.....");
				}
				break;
			case 2:
				Iterator i=v.iterator();
				while(i.hasNext()) {
					Object obj=i.next();
					System.out.println(obj);
				}
				break;
			case 3:
				System.out.println("Enter value for search");
				value=xyz.nextInt();
				b=v.contains(value);
				if(b) {
					System.out.println("Value Found.....");
				}
				else
				{
					System.out.println("Value Not Found");
				}
				break;
			case 4:
				System.out.println("Enter Value for Search");
				value=xyz.nextInt();
				int index=v.indexOf(value);
				if(index!=-1) {
					System.out.println("Data Avilable.....");
				}
				else
				{
					System.out.println("Data Not Found");
				}
				break;
			case 5:
				System.out.println("Enter the start index and end index");
				int startIndex=xyz.nextInt();
				int endIndex=xyz.nextInt();
				if(startIndex>=0 && endIndex<=v.size())
				{
				List list=v.subList(startIndex, endIndex);
				Iterator itr=list.iterator();
				while(itr.hasNext());
				{
					Object obj=itr.next();
					System.out.println(obj);
				}
				}
				else{
					System.out.println("Cannot Create Sublist");
				}
				break;
			case 6:
				int count=v.size();
				System.out.println("Number of element present in Vector"+count);
				break;
			case 7:
				b=v.isEmpty();
				if(b) {
				System.out.println("Vector is Empty");
			}
				else
				{
				System.out.println("Vector Contain Data.....");
				}
				break;
			case 8:
				try {
					System.out.println("Enter Index");
					index=xyz.nextInt();
					Object obj=v.get(index);
					System.out.println(obj);
					}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Error is "+e.getMessage());
				}
				break;
				default:
					System.out.println("Wrong Choice");
			
		}
	}while(true);

}
}