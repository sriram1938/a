package SetterGetter;
/*
		*** Setter Getter ***
		=====================
 ----------------------------------------------------------------
	static variable: Access using class-name
	instance variable: Access using object-Address(this)
	arguments,local variables: Access directly
 ----------------------------------------------------------------	
	class Test
	{
		static int a = 0;
		static void setter(int a)
		{
			Test.a = a;
		}
		static int getter()
		{
			return Test.a;
		}
	}
	
	class Test
	{
		int x;
		void setter(int x)
		{
			this.x = x;
		}
		int getter()
		{
			return this.x;
		}
	}
 ----------------------------------------------------------------
	
   private variables of another class can not be access directly
	
 ----------------------------------------------------------------
	public class Code
	{
		public static void main(String[] args)
		{
			System.out.println("x val : "+Test.x);
			System.out.println("y val : "+Test.y);	//Error: private access
		}
	}
	class Test
	{
		public static int x=10;
		private static int y=10;
	}
 ----------------------------------------------------------------
 
	Access private variables using get method

 ----------------------------------------------------------------
	public class Code
	{
		public static void main(String[] args)
		{
			System.out.println("x val : "+Test.getX());
		}
	}
	class Test
	{
		private static int x=10;
		
		public static int getX()
		{
			return Test.x;
		}
	}
 ----------------------------------------------------------------
	
	public class Code
	{
		public static void main(String[] args)
		{
			System.out.println("default val : "+Test.getX());
			Test.setX(100);
			System.out.println("new val : "+Test.getX());
		}
	}
	class Test
	{
		private static int x;
		
		public static int getX()
		{
			return Test.x;
		}
		public void setX(int x)
		{
			Test.x = x;
		}
	}
 ----------------------------------------------------------------
 
     Accessing private instance variable using setters & getters
	
 ----------------------------------------------------------------	
	public class Code
	{
		public static void main(String[] args)
		{
			Test t = new Test();
			System.out.println("default val : "+t.getX());
			t.setX(100);
			System.out.println("new val : "+t.getX());
		}
	}
	class Test
	{
		private int x;
		
		public int getX()
		{
			return this.x;
		}
		public void setX(int x)
		{
			this.x = x;
		}
	}
 ----------------------------------------------------------------
	
Q. write setters & getters for EMPLOYEE Details
public class Code
{
	public static void main(String[] args)
	{
		Employee e = new Employee();
		e.setId(1001);
		e.setName("Ram");
		e.setSalary(35000);
		System.out.println("Details : "+e.getId()+","+e.getName()+","+e.getSalary());
	}
}
class Employee
{
	private int id;
	private String name;
	private double salary;

	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}


	public int getId()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
	public double getSalary()
	{
		return this.salary;
	}
}

 ----------------------------------------------------------------
*/
public class SetGet 
{
}
