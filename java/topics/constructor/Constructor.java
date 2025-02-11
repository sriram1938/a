package constructor;
/*
		*** Constructor ***
		===================
			
 => defining a method using class name
 => return type is not allowed for the constructor
 => constructor executes in object creation process
 
 ----------------------------------------------------------------
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
 ----------------------------------------------------------------
 
 => it is used to provide initial values to instance variables 
 	in object creation process
 	
 ----------------------------------------------------------------
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
 ----------------------------------------------------------------
 
 		*** toString() ***
 		==================
 
 => it is predefined java method
 => it is used to display the information of objects
 => toString method automatically executes when you print 
  	objects reference variable
  	
 ----------------------------------------------------------------
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
 ----------------------------------------------------------------
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
 ----------------------------------------------------------------
	
	1. parameterized Constructor
		is used to constructor object with all details at a time
	2. toString() method
		to display all the details of object at a time
	3. setter method
		to modify(change) value of single instance variable
	4. getter method
		to display single instance variable value
	
*/
public class Constructor {

}
