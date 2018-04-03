class Emp
{
	int id,age;
	String name;
	Emp()
	{
		name="Raj";
		id=101;
		age=45;
	}
}
class S extends Emp
{
	S(){
	super();
	}
	void display(){
	System.out.println(name+id+age);
	}
}
public class abstract
{
	public static void main(String args[])
	{
		Emp e=new S();

		e.display();
	}
}