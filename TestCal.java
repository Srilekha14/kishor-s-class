 class Calculator
{
	
	static int max,min,sum;
	int findmax(int e[])
	{
		max=e[0];
		for(int t:e)
		{
			if(t>max)
			{	
				max=t;
			}
		}
	return max;
                                           	}
	
	int findmin(int e[])
	{
		min=e[0];
		for(int t:e)
		{
			if(t<min)
			{	
				min=t;
			}
		}
	return min;
	}
	
	int findsum(int e[])
	{
		sum=0;
		for(int t:e)
		{
			sum=sum+t;
		}
	return sum;
	}
	
}
public class TestCal
{
	public static void main(String[] args)
	{
	
		int[] e=new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			e[i]=Integer.parseInt(args[i]);
		}
		Calculator a=new Calculator();
		int max=a.findmax(e);
		int min=a.findmin(e);
		int sum=a.findsum(e);
		System.out.println("Max: "+max+"\nMin : "+min+"\nSum: "+sum);
	}
}