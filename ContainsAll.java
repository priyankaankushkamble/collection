import java.util.ArrayList;
import java.util.Collection;
public class ContainsAll
{
	public static void main(String x[])
	{
		ArrayList<Integer> al=new ArrayList<>();
	al.add(100);
	al.add(200);
	al.add(300);
	al.add(400);

	Collection<Integer> c=new ArrayList<>();
	c.add(100);
	c.add(200);

	boolean b=al.containsAll(c);
	if(b)
	{
		System.out.println("Values Found.....");
	}
	else
	{
	System.out.println("Values Not Found");
	}
	}
}