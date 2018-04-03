class Emp
{
	int id,age;
	String name;
	Emp()
	{
		name="Raj";
		id=101;
		age=45;
		System.out.println(name+id+age);
	}
}
class S extends Emp
{
	S(){
	super();
	}
	
}
public class abstra
{
	public static void main(String args[])
	{
		Emp e=new S();
		


	
	}
}