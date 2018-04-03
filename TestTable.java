class Table
{
	int rows;
	int cols;
	Table()
	{
		System.out.println("Table() Created");
		rows=1;
		cols=1;	
	}
	Table(int x,int y)
	{
		System.out.println("Table(int,int) created");
		rows=x;
		cols=y;
	}
	void CalculateCells()
	{
		int r=rows*cols;
		System.out.println("Result="+r);
	}
}
class TestPrograms
{
	public static void main(String[] args)
	{
		Table t1=new Table(30,40);
		Table t2=new Table();
		Table t3=new Table(10,40);
		t2.rows=100;
		t2.cols=200;
		t1.CalculateCells();
		t2.CalculateCells();
		t3.CalculateCells();
	}
}