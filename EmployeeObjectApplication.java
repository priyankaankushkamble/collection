package org.techhub;

import java.util.*;

public class EmployeeObjectApplication {

	public static void main(String[] args) {

	 Vector v=new Vector();
	 
	 Employee emp1=new Employee();
	 emp1.setId(1);
	 emp1.setName("Ram");
	 emp1.setSal(670000);
	 
	 Employee emp2=new Employee();
	 emp2.setId(2);
	 emp2.setName("Shyam");
	 emp2.setSal(54000);
	  
	 Employee emp3=new Employee();
	 emp3.setId(3);
	 emp3.setName("Krushna");
	 emp3.setSal(650000);
	 
	 v.add(emp1);
	 v.add(emp2);
	 v.add(emp3);
	 
	 for(Object obj:v) {
		 Employee e=(Employee)obj;
		 System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		 }
	 }
	 

}



