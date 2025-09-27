import java.util.*;
public class RemoveVector
{
	public static void main(String x[])
	{
		Vector v=new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
	
		Iterator i=v.iterator();
		System.out.println("Before Remove Element "+v);
		while(i.hasNext())
		{
			Object obj=i.next();
			if((int) obj==300)
			{
				i.remove();
			}
		}
		System.out.println("After Remove Element "+v);
	}

}