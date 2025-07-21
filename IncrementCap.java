import java.util.*;
public class IncrementCap
{
	public static void main(String x[])
	{
	Vector v=new Vector(5,2);
	int cap=v.capacity();
	System.out.println("Initial capacity of vector is:"+cap);
	v.add(10);
	v.add(20);
	v.add(30);
	v.add(40);
	v.add(50);
	v.add(60);
	System.out.println("Size of vector is:"+v.size());
	System.out.println("After inserting value in vector capacity is:"+v.capacity()); 
	}
}