import java.util.*;
public class CopyDataApp
{
	public static void main(String x[])
	{
	Set c=new LinkedHashSet();
	c.add(10);
	c.add(20);
	c.add(30);
	Vector v=new Vector(c);
	System.out.println(v);
	}
}
