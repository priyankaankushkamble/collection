import java.util.ArrayList;
public class ArrayListEmpty
{
	public static void main(String x[])
	{
	ArrayList<Integer> al=new ArrayList<>();
	al.add(100);
	al.add(200);
	al.add(300);
	al.add(400);

	Boolean b=al.isEmpty();
if(b)
	{
		System.out.println("Collection is empty");
	}
	else
	{
		System.out.println("Collection is not empty");
	}
	}
}