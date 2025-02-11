package variables;

/*
		*** JAVA VARIABLES ***
		======================
		
 => variables are used to store information
 => depends on data of a program, we use different types of variables
 
 => static variables:
 	=================
 	=> define a variable inside class using static keyword
 	=> static variables store common information
 	=> static variables get memory only once
 	=> we can access static variable using class name
 	
 => Instance variable:
 	==================
  	=> defining a variable inside method without static keyword
  	=> these variables store specific information of object
  	=> these variables get separate memory for every object
  	=> we access these variables through object address
  	
 => method parameters
 	=> writing variables inside method parenthesis
 	=> these variables used to take input of a method
 	
 => local variables
 	=> defining variables inside the method
 	=> these variables store the data temporarily inside the method
 	
 ----------------------------------------------------------------
	class Employee 
	{
		static String company = "HDFC";
		
		int id;
		String name;
		double salary;
		
		void totalSalary(double basic)
		{
			double hra = 0.12 * basic;
			double ta = 0.08 * basic;
			double da = 0.05 * basic;
			double total = basic+hra+ta+da;
			System.out.println(total);
		}
	}
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
	
	A. 	public class Code
		{
			public static void main(String[] args)
			{
				Employee e = new Employee();
				e.setId(1001);
				e.setName("Ram");
				e.setSalary(35000);
				System.out.println("Details : "+e.getId()+","+e.getName()+","+e.getSalary);
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
 
		*** Constructor ***
		===================
 => defining a method using class name
 => return type is not allowed for the constructor
 => constructor executes in object creation process
 
 
 	public class Code
	{
		public static void main(String[] args)
		{
			Test t1 = new Test();
			Test t2 = new Test();
		}
	}
	class Test
	{
		public Test()
		{
			System.out.println("constructor");
		}
	}
	
 => it is used to provide initial values to instance variables 
 	in object creation process
 
 	public class Code
	{
		public static void main(String[] args)
		{
			Test t1 = new Test(10,20,30);
			Test t2 = new Test(40,50,60);
			
			t1.Details();
			t2.Details();
		}
	}
	class Test
	{
		private int a,b,c;
		public Test(int a,int b,int c)
		{
			this.a = a;
			this.b = b;
			this.c = c;
		}
		public void details()
		{
			System.out.println("Details : "+this.a+","+this.b+","+this.c);
		}
	}
 
 
 
 		*** toString() ***
 		==================
 => it is predefined java method
 => it is used to display the information of objects
 => toString method automatically executes when you print 
  	objects reference variable
  	
  	
 	public class Code
	{
		public static void main(String[] args)
		{
			Test t1 = new Test(10,20,30);
			Test t2 = new Test(40,50,60);
			
			System.out.println("t1 details : "+t1);
			System.out.println("t2 details : "+t2);
		}
	}
	class Test
	{
		private int a,b,c;
		public Test(int a,int b,int c)
		{
			this.a = a;
			this.b = b;
			this.c = c;
		}
		public String toString()
		{
			return this.a+","+this.b+","+this.c;
		}
	}
	
	
	public class Code
	{
		public static void main(String[] args)
		{
			Employee e1 = new Employee(101,"Ram",24000);
			Employee e2 = new Employee(102,"Ramya",35000);
			
			System.out.println("e1 details : "+e1);
			System.out.println("e2 details : "+e2);
		}
	}
	class Employee
	{
		private int id;
		private String name;
		private double salary;
		public Employee(int id,String name,double salary)
		{
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		public String toString()
		{
			return this.id+","+this.name+","+this.salary;
		}
	}
	
	
	1. parameterized Constructor
		is used to constructor object with all details at a time
	2. toString() method
		to display all the details of object at a time
	3. setter method
		to modify(change) value of single instance variable
	4. getter method
		to display single instance variable value
	
*/

public class Variables 
{
	public static void main(String[] args) 
	{	

	}
}
