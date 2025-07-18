import java.util.ArrayList;
public class Contains
{
	public static void main(String x[])
	{
		ArrayList<Integer> al=new ArrayList<>();
	al.add(10);
	al.add(20);
	al.add(30);
	Boolean b=al.contains(30);
	if(b)
	{
		System.out.println("Data Found");
	}
	else
	{
		System.out.println("Data Not Found");
	}
	}
}