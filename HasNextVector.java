import java.util.*;
public class HasNextVector
{
	public static void main(String x[])
	{
		Vector v=new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);

		Iterator i=v.iterator();

		while(i.hasNext())	
		{
			Object obj=i.next();
			System.out.println(obj);
		}
	}
}