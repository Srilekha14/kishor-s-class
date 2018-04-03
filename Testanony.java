interface Calculator
{
	public int operations(int a,int b){};
}
class Testanony
{
public static void main(String[] args)
{
	Calculator c1=new Calculator(){
	public int operations(int a,int b)
	{
	System.out.println("doing addition");
	return(a+b);
	}
};
int res=c1.operations(20,30);
System.out.println("Result="+res);
res=new Calculator()
{
public int operations(int a,int b)
{
System.out.println("doing subtraction");
return(a-b);
}.operations(40,30);
System.out.println("Result="+res);
}

}