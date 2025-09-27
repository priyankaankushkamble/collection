import java.util.*;
public class VectorPrintApp
{
	public static void main(String x[])
	{
		Vector v=new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);

		for(Object obj:v)
		{
			System.out.println(obj);
		}
	}
}