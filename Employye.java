class Employee
{
	int empId;
	double salary;
	String empName,gender;
	Employee(int empId,String empName,double salary,String gender)
 	{
		this.empId=empId;this.empName=empName;this.salary=salary;this.gender=gender;
	}
	void display()
	{

		System.out.println("EmpId="+empId+","+"Employee Name="+empName+","+"Salary="+salary+","+" Gender="+gender);
	}	
	void UpdateSalary(double salary)
	{
		System.out.println("Updated Salary");
		this.salary=salary;
		display(); 
	}
	void raiseSalary()
	{
		System.out.println("Raised Salary");
		salary=salary+(salary*0.05);display();
	}

}
class A
{
	public static void main(String[] args)
	{
		Employee e1=new Employee(101,"Raj",20000,"Male");
		Employee e2=new Employee(102,"geetha",30000,"Female");
		Employee e3=new Employee(103,"Pavi",1000,"female");
		e1.display();
		e2.display();
		e3.display();
		e1.raiseSalary();e2.raiseSalary();e3.raiseSalary();
		//e1.display();
		e1.UpdateSalary(40000);
		//e1.display();
		e2.UpdateSalary(50000);
		//e2.display();
		//e3.display();e3.UpdateSalary(4000);		
		
	}
}