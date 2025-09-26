import java.util.*;
public class ArrayVector
{
	public static void main(String x[])
	{
	ArrayList al=new ArrayList();
	al.add(10);
	al.add(20);
	al.add(30);

	Vector v=new Vector(al);
	System.out.println(v);
	}
}