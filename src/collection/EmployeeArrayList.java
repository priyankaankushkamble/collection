package collection;

import java.util.ArrayList;

class Employee {
	int id;
	String name;
	int sal;

	public Employee(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public void display() {
		System.out.println("ID is:" + id );
		System.out.println("Name is:" + name);
		System.out.println("Salary is:" + sal);
	}
}

public class EmployeeArrayList {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<>();

		employees.add(new Employee(10, "Raj", 450000));
		employees.add(new Employee(15, "Ram", 50000));
		employees.add(new Employee(20, "Rahul", 50000));
		employees.add(new Employee(25, "Shakti", 80000));
		employees.add(new Employee(30, "Sanskar", 40000));

		System.out.println("Employee Details:");
		for (Employee emp : employees) {
			emp.display();
		}
	}

}
