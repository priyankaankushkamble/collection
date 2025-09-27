import java.util.*;
public class VectorSize
{
	public static void main(String x[])
	{

	Vector v=new Vector();
	v.add(100);
	v.add(200);
	v.add(300);
	v.add(400);
	v.add(500);




		for(int i=0;i<v.size();i++)
	{
		Object obj=v.get(i);
		System.out.println(obj);
	}
	}


}