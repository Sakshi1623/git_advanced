class Employee
{
	String name;
	int id,salary;
	
	int Salary()
	{
		return (this.salary)*12;
	}
}

class EmployeeDemo
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.name = "Kiran";
		e1.id = 1738839;
		e1.salary = 45000;
		
		e2.name = "Supriya";
		e2.id = 877498;
		e2.salary = 55000;
		
		System.out.println("Name = "+e1.name+" id="+e1.id+" Salary ="+e1.Salary());
		System.out.println("Name ="+e2.name+" id="+e2.id+" Salary ="+e2.Salary());
		
	}
}
