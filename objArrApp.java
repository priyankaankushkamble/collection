public class objArrApp
{
	public static void main(String x[])
	{
	Object obj[]=new Object[5];
	obj[0]=5;
	obj[1]=5.4f;
	obj[2]=false;
	obj[3]="ABC";
	obj[4]=new java.util.Date();
	System.out.println("Display The Array Values");
	for(int i=0;i<obj.length;i++)
	{
		System.out.println(obj[i]);
	}	

	}
}
