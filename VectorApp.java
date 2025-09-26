import java.util.*;
public class VectorApp
{
	public static void main(String x[])
	{
	Vector v=new Vector(5,2);
	System.out.println("Initial Capacity of vector is "+v.capacity());
	v.add(100);
	v.add(200);
	v.add(300);
	v.add(400);
	v.add(500);
	v.add(600);
	System.out.println(v);
	System.out.println("Capacity After increment "+v.capacity());
	}
}