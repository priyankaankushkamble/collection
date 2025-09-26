public class objectArray
{
	public static void main(String x[])
	{
		object obj=new object[5];
		obj[0]=false;
		obj[1]=7.9f;
		obj[2]=true;
		obj[3]=ABC;
		obj[4]=123;
		System.out.println("Display the values");
		for(int i=0;i<obj.length;i++)
		{
			System.out.printf("value is:"+obj[i]);
		}
	
		
	}
}