import java.util.ArrayList;
public class Remove
{
	public static void main(String x[])
	{
		ArrayList<Integer> al=new ArrayList<>();
	al.add(100);
	al.add(200);
	al.add(300);
	al.add(400);

	boolean b=al.remove(Integer. valueOf(300));
	if(b)
	{
		System.out.println("Element Remove Successfully....");
	}
	else
	{
		System.out.println("Some Problem is There");
	}
	}
}
