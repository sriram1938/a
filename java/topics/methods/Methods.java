package methods;

/*
			*** METHODS ***
 => method is block of instructions that performs a task.
 => program execution automatically starts with main method.
 
 	Static method :
 	=> defining a method using static keyword.
 	=> we can access the static methods using class name
 	
 	note: only main method execute automatically
 			all other methods must be execute manually
 			
 	public class Methods 
	{
		public static void main(String[] args) 
		{
			System.out.println("main...");
			Test.abc();		//calling
			Test.abc();
	
		}
	
	}
	class Test
	{
		public static void abc()
		{
			System.out.println("abc...");
		}
	}
 	
 			naming rules
 	class: Every word starts with Capital letter
 			String
 			AccountHolder
 			FileNotFoundException
 			
 	method: Camel Case
 			main()
 			getName()
 			getAccountNumber()
 			
 			
 => one program can have any number of Classes
 => one Class can have any number of methods
 
 	public class Code
 	{
 		public static void main(String[] args) 
		{
			Hello.everyOne();
			Say.hi();
		}
	}
	class Say
	{
		public static void hi()
		{
			System.out.println("Hi...all");
		}
	}
	class Hello
	{
		public static void everyOne()
		{
			System.out.println("Hello EveryOne");
		}
	}
	
			** Method with Arguments **
	
	public class Code
 	{
 		public static void main(String[] args) 
		{
			Add.nums(10, 20);
		}
	}
	class Add
	{
		public static void nums(int a,int b)
		{
	
			System.out.println("sum = "+(a+b));
		}
	}
		
 Q. Different type arguments
 
 A. public class Code
 	{
 		public static void main(String[] args) 
		{
			Print.empDetails(1001, "Ram", 35000);
		}
	}
	class Print
	{
		public static void empDetails(int id, String name, double salary)
		{
			System.out.println(id+","+name+","+salary);
		}
	}
 		
 Q. Read age & call with that
 
 A. import java.util.Scanner;
 	public class Code
 	{
 		public static void main(String[] args) 
		{
			Scanner sc = new Scanner();
			System.out.println("Enter age :");
			int age = sc.nextInt();
			Person.canVote(age);
		}
	}
	class Print
	{
		public static void canVote(int age)
		{
			if(age>=18)
				System.out.println("can vote");
			else
				System.out.println("can not vote");
		}
	}
 
 Q. Method with Arguments & return values
 
 A. public class Code
 	{
 		public static void main(String[] args) 
		{
			int res = Add.nums(10, 20);
			System.out.println(res);
			System.out.println("sum = "+res);
		}
	}
	class Add
	{
		public static int nums(int a, int b)
		{
			int c = a+b;
			return c;
		}
	}
 
 Q. even or odd
 
 A. public class Code
 	{
 		public static void main(String[] args) 
		{
			String res = Check.isEven(13);
			System.out.println("Result : "+res);
		}
	}
	class Check
	{
		public static String isEven(int n)
		{
			if(n%2==0)
				return "Even num";
			else
				return "Not Even num";
		}
	}
	
 Q. Method without Arguments & with return values
 
 A. public class Code
 	{
 		public static void main(String[] args) 
		{
			double pi = Get.PI();
			System.out.println("PI value : "+pi);
		}
	}
	class Get
	{
		public static double PI()
		{
			return 3.146;
		}
	}
	
	
		*** Classification ***
	
	No arguments & No return values
		void hello()
		
	with arguments & No return values
		void add(int a, int b)
		
	with arguments & with return values
		String isEven(int num)
		
	No arguments & with return values
		double getPI()
 
 
 Q. Passing Array as input to method
 A. public class Code
 	{
 		public static void main(String[] args) 
		{
			int[] arr = {3,4,5,6,7};
			Print.array(arr);
		}
	}
	class Print
	{
		public static void array(int[] arr)
		{
			for(int ele : arr)
				System.out.println(ele);
		}
	}
 
 Q. method is returning Array
 A. public class Code
 	{
 		public static void main(String[] args) 
		{
			int[] res = Get.array();
			for(int ele : res)
				System.out.println(ele);
		}
	}
	class Print
	{
		public static int[] array()
		{
			int[] arr = {3,4,5,6,7};
			return arr;
		}
	}


 	Instance method :
 	=> defining a method without static keyword.
 	=> we can access the method using object.
 	
 	public class Code
 	{
 		public static void main(String[] args) 
		{
			Say.hi();
			Say s = new Say();		//object creation
			s.hello();
		}
	}
	class Say
	{
		public static void hi()
		{
			System.out.println("Hi all");
		}
		public void hello()
		{
			System.out.println("Hello all");
		}
	}
 	
 	=> we can call any number of methods with single instance(object)
 	
 	public class Code
 	{
 		public static void main(String[] args) 
		{
			Calc c = new Calc();		//object creation
			c.sum(5,7);
			c.product(5,7);
		}
	}
	class Calc
	{
		public void sum(int a,int b)
		{
			System.out.println("sum = "+(a+b));
		}
		public void product(int a,int b)
		{
			System.out.println("product = "+(a*b));
		}
	}

*/



public class Methods 
{
	public static void main(String[] args) 
	{
		System.out.println("main...");
		Test.abc();		//calling
		Test.abc();

	}

}
class Test
{
	public static void abc()
	{
		System.out.println("abc...");
	}
}
