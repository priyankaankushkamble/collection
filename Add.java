import java.util.*;
public class Add
{
	public static void main(String x[])
	{
		ArrayList <Integer> al=new ArrayList<>();
	Boolean b=al.add(100);
	if(b)
	{
	System.out.println("New Element Added in Collection");
	}
	else
	{
		System.out.println("Some Problem Is There");
	}
	}
}