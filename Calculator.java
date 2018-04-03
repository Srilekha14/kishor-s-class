public class Calculator
{
	
	static int max,min,sum;
	int findmax(int e[])
	{
		max=e[0];
		for(int t:e)
		{
			if(e[t+1]>max)
			{	
				max=e[t+1];
			}
		}
	return max;
	}
	
	int findmin(int e[])
	{
		min=e[0];
		for(int t:e)
		{
			if(e[t+1]<min)
			{	
				max=e[t];
			}
		}
	return min;
	}
	
	int findsum(int e[])
	{
		sum=0;
		for(int t:e)
		{
			sum=sum+e[t];
		}
	return sum;
	}
	
}
public class TestCal
{
	public static void main(String[] args)
	{
		int[] e=new int[3];
		e[0]=Integer.parseInt(args[0]);
		e[1]=Integer.parseInt(args[1]);
		e[2]=Integer.parseInt(args[2]);
		Calculator a=new Calculator();
		int max=a.findmax(e);
		int min=a.findmin(e);
		int sum=a.findsum(e);
		System.out.println("Max: "+max+"\nMin : "+min+"\nSum: "+sum);
	}
}