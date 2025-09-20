package collection.hub;

public class ArrApp {

	public static void main(String[] args) {
		Object obj[]=new Object[5];
		obj[0]=100;
		obj[1]=new java.util.Date();
		obj[2]="good";
		obj[3]="False";
		obj[4]=5.4f;
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i]);
		}
	
	}

}
