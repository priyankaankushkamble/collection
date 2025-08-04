package org.techhub;
import java.util.*;
public class StackApplication {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		int choice,value,index;
		Stack s=new Stack();
		do {
			
			System.out.println("1:PUSH element in Satck");
			System.out.println("2:POP Element from stack");
			System.out.println("3:PEEK element from stack");
			System.out.println("4:Display All Values from stack");
			System.out.println("5:Seach All Values From Stack");
			System.out.println("Enter Your Choice");
			
			choice=xyz.nextInt();
			switch(choice) {
			case 1:
				
				System.out.println("Enter Value in stack");
				value=xyz.nextInt();
				s.push(value);
				break;
				
				
			case 2:
				
				boolean b=s.empty();
				if(b) {
					System.out.println("Stack is underflow");
				}
				else
				{
					Object obj=s.pop();
					System.out.println("Removed data from stack"+obj);
				}
				break;
				
			case 3:
				b=s.empty();
				if(b) {
					System.out.println("Stack is underflow");
				}
				else
				{
					Object obj=s.peek();
					System.out.println("Last element from stack is "+obj);
				}
				break;
			case 4:
				ListIterator li=s.listIterator(s.size());
				while(li.hasPrevious()) {
					Object obj=li.previous();
					System.out.println(obj);
				}
				break;
			case 5:
				System.out.println("Search element in satck");
				value=xyz.nextInt();
				index=s.search(value);
				if(index!=-1) {
					System.out.println("Element Found");
				}
				else
				{
					System.out.println("Element Not Found");
				}
				break;
			case 6:
				System.exit(0);
				default:
					System.out.println("Wrong Choice");
			}
			}
		while(true);

	}
}
