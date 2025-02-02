package a;

public class Notes {

	public static void main(String[] args) {

		
		//Q. Give 20% discount on Every bill ?
		double bill=2500;
		double discount=bill*20/100;
		bill=bill-discount;
		System.out.println("pay : "+bill);

		//Q. Give 20% discount on minimum bill of 5000 ?
		double bill=7500;
		if(bill>=5000)
		{
			double discount=bill*20/100;
			bill=bill-discount;
		}
		System.out.println("pay : "+bill);

		//if-else
		//Q. person can vote ?
		int age=12;
		if(age>=18)
		{
			System.out.println("you are eligible");
		}
		else
			System.out.println("Not eligible");

		//Q. check number even or odd ?
		int num=9;
		if(num%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}

		//if-else if
		//Q. shape is triangle/square/pentagon/other ?
		int side=5;
		if(side==3)
			System.out.println("triangle");
		else if(side==4)
			System.out.println("square");
		else if(side==5)
			System.out.println("pentagon");
		else
			System.out.println("other shape");

		//nested if
		//writing if block inside another if block
		//Q. check num is +ve or -ve, if +ve then check even or odd ?
		int n=?;
		if(n>0)
		{
			if(n%2==0)
				System.out.println("Even");
			else
				System.out.println("Odd");
		}
		else
		{
			System.out.println("negative number");
		}

		//Q. check the number is 2 digit or not ?
		int num=?;
		if(num>=10 && num<=99)
		{
			System.out.println("2-digit number");
		}
		else
		{
			System.out.println("Not 2-digit number");
		}

		//Q. check the Character is upper/lower/digit/symbol ?
		char ch='?';
		if(ch>='A' && ch<='Z')
			System.out.println("upperCase");
		else if(ch>='a' && ch<='z')
			System.out.println("lowerCase");
		else if(ch>='0' && ch<='9')
			System.out.println("digit");
		else
			System.out.println("symbol");

		//Q. print 1-5 & 5-1 numbers ?
		System.out.println("1-5 nums");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		System.out.println("5-1 nums");
		for(int i=5;i>=1;i--)
		{
			System.out.println(i);
		}


		//Q. print 1-N & N-1 numbers ?
		int n=?;
		System.out.println("1-n nums");
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
		System.out.println("n-1 nums");
		for(int i=n;i>=1;i--)
		{
			System.out.println(i);
		}

		//Q. print nums with start & end ?
		int start=?,end=?;
		System.out.println("start-end nums");
		for(int i=start;i<=end;i++)
		{
			System.out.println(i);
		}
		System.out.println("5-1 nums");
		for(int i=end;i>=start;i--)
		{
			System.out.println(i);
		}

		//Q. print Alphabets upperCase A-Z ?
		System.out.println("Alphabets : ");
		for(char ch='A' ; ch<='Z' ; ch++)
		{
			System.out.println(ch);
		}

		//Q. print multiplication tables ?
		int n=?;
		for(int i=1 ; i<=10 ; i++)
		{
			System.out.println(n+" * "+i+" = "+(n*i));
		}

		//Q. find sum of first n numbers ?
		int n? , sum=0;
		for(int i=1 ; i<=n ; i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);

		//Q. find factorial of given number ?
		int n=? , fact=1;
		for(int i=1 ; i<=n ; i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);

		// form 1-10
		// print Evens
		for(int i=1 ; i<=10 ; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
		// count evens
		int count=0;
		for(int i=1 ; i<=10 ; i++)
		{
			if(i%2==0)
			{
				count++;
			}
		}
		System.out.println(count);
		
		// sum of evens
		int sum=0;
		for(int i=1 ; i<=10 ; i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);

		//Q. factors of given number ?
		int n=?;
		for(int i=1 ; i<=n ; i++)
		{
			if(n%i==0)
			{
				System.out.println(i+"is a factor");
			}
		}

		//Q. count factors of given number ?
		int n=?, count=0;
		for(int i=1 ; i<=n ; i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		System.out.println(count);

		//Q. sum of factors of given number ?
		int n=?, sum=0;
		for(int i=1 ; i<=n ; i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);

		//	primeNumber
		//the number which is having only 2 factors 
		int n=? , count=0;
		for(int i=1 ; i<=n ; i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("Not prime");
		}

		//	perfect number
		//sum of factors except itself is equal to same number
		int n=? , sum=0;
		for(int i=1 ; i<n ; i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println("perfect");
		}
		else
		{
			System.out.println("Not perfect");
		}

		//Q. even numbers from 1-10 ?
		for(int n=1 ; n<=10 ; n++)
		{
			if(i%2==0)
			{
				System.out.println(n);
			}
		}

		//Q. print tables from 5 to 15 ?
		for(int n=5 ; n<=15 ; n++)
		{
			for(int i=5 ; i<=10 ; i++)
			{
				System.out.println(n+" * "+i+" = "+(n*i));
			}	
		}

		//Q. print factorials from 2 to 8 ?
		for(int n=2 ; n<=8 ; n++)
		{
			int fact=1;
			for(int i=1 ; i<=n ; i++)
			{
				fact=fact*i;
			}
			System.out.println(fact);
		}

		//Q. print prime numbers from 1 to 100 ?
		for(int n=1 ; n<=100 ; n++)
		{
			int count=0;
			for(int i=1 ; i<=n ; i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(n);
			}
		}

		//Q. print perfect numbers from 1 to 10000 ?
		for(int n=1 ; n<=10000 ; n++)
		{
			int sum=0;
			for(int i=1 ; i<n ; i++)
			{
				if(n%i==0)
				{
					sum=sum+i;
				}
			}
			if(sum==n)
			{
				System.out.println(n);
			}
		}

		//Scanner Class
		/*
		=> Scanner class is used to read input values from user.
  		=> belongs to " java.util " package.
    		=> we must create object of scanner class to access the methods 
      		which are used to read input values.
			Scanner sc = new Scanner(System.in);
   		=> scanner class provides different methods to read different types
     		of input values.
       		Read String :- string s = sc.next();
	 	Read Integer :- int x = sc.nextInt();
   		Read Double :- double y = sc.nextDouble();
     		Read Boolean :- boolean b = sc.nextBoolean();
       		Read Character :- character ch = sc.next().charAt(0);
       		
		*/

		//Q. Read & print your name ?
		import java.util.Scanner;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		string name = sc.next();
		System.out.println("welcome "+name);

		//Q. Read 2 nums and print addtion of them ?
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first num : ");
		int a = sc.nextInt();
		System.out.println("Enter second num : ");
		int b = sc.nextInt();
		int c = a+b ;		
		System.out.println("sum = "+c);

		//Q. Read Character & check alphabet or not ?
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character : ");
		char ch = sc.next().charAt(0);
		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
		{
			System.out.println("Aplhabet");
		}
		else
		{
			System.out.println("Not Aplhabet");
		}

		//Q. Read emp Details (id, name, salary) & print them ?
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Emp Details(id, name, salary) : ");
		int id = sc.nextInt();
		string name = sc.next();
		double salary = sc.nextDouble();
		System.out.println("Details : "+id+", "+name+", "+salary);

		//Q. Read number & Check even or not until user stops ?
		Scanner sc = new Scanner(System.in);
		while(true)
			{
				System.out.println("Enter number : ");
				int n = sc.nextInt();
				if(n%2==0)
				{
					System.out.println("Even");
				}
				else
				{
					System.out.println("Odd");
				}
				System.out.println("Do you want to stop (y/n) : ");
				char ch = sc.next().charAt(0);
				if(ch=='y' || ch=='Y')
				{
					break;
				}
			}

		//Q. Read num & print table until user continue ?
		Scanner sc = new Scanner(System.in);
		while(true)
			{
				System.out.println("Enter number : ");
				int n = sc.nextInt();
				for(int i=1 ; i<=10 ; i++)
					{
						System.out.println(n+" * "+i+" = "+(n*i));
					}
				System.out.println("Do you want to continue (y/n) : ");
				char ch = sc.next().charAt(0);
				if(ch=='n' || ch=='N')
				{
					break;
				}
			}


		//Q. Menu Driven program of Arthe
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			
			System.out.println("1. Add 2 nums");
			System.out.println("2. Symbol or Not");
			System.out.println("3. Big of 3 Nums");
			System.out.println("4. Display Table");
			System.out.println("5. Perfect Number");
			System.out.println("6. Exit");
			
			System.out.println("Enter your choice : ");
			int choice=sc.nextInt();
			
			if(choice==1)
			{
				System.out.println("Enter 2 nums :");
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println("sum = "+(a+b));
			}
			else if(choice==2)
			{
				System.out.println("Enter Character :");
				char ch=sc.next().charAt(0);
				if(!((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')))
				{
					System.out.println(ch+" is a symbol");
				}
				else
					System.out.println(ch+" Not a symbol");
			}
			else if(choice==3)
			{
				System.out.println("Enter 3 nums :");
				int a=sc.nextInt();
				int b=sc.nextInt();
				int c=sc.nextInt();
				
				if(a>b && a>c)
					System.out.println(a+" is big");
				else if(b>c)
					System.out.println(b+" is big");
				else
					System.out.println(c+" is big");
			}
			else if(choice==4)
			{
				System.out.println("Enter num :");
				int a=sc.nextInt();
				for(int i=1;i<=10;i++)
				{
					System.out.println(a+" * "+i+" = "+(a*i));
				}
			}
			else if(choice==5)
			{
				System.out.println("Enter num :");
				int a=sc.nextInt();
				int sum=0;
				for(int i=1;i<a;i++)
				{
					if(a%i==0)
						sum+=i;
				}
				if(sum==a)
					System.out.println("Perfect Number");
				else
					System.out.println("Not a Perfect Number");
			}
			else if(choice==6)
			{
				System.out.println("your session Exited");
				break;
			}
			else
				System.out.println("invalid choice");
		}
		

				//Digit Based 
		//Q. To count digits in given number ?
		int n=?;
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);

		//Q. To find the sum of digits ?
		int n=?;
		int sum=0;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println(sum);

		//Q. print even digits of given number ?
		int n=?;
		while(n!=0)
		{
			int d=n%10;
			if(d%2==0)
			{
				System.out.println(d);
			}
			n=n/10;
		}

		//Q. count of even digits of given num ?
		int n=?;
		int count=0;
		while(n!=0)
		{
			int d=n%10;
			if(d%2==0);
			{
				count++;
			}
			n=n/10;
		}
		System.out.println(count);

		//Q. sum of even digits of given number ?
		int n=?;
		int sum=0;
		while(n!=0)
		{
			int d=n%10;
			if(d%2==0)
			{
				sum=sum+d;
			}
			n=n/10;
		}
		System.out.println(sum);

		//  STRUCTURE FOR DIGIT BASED PROGRAMS
		int n=?;
		while(n!=0)
		{
			int d=n%10;
			{



			}
			n=n/10;
		}

		//Q. find the factorial for every digit ?
		int n=?;
		int fact=1;
		while(n!=0)
		{
			int d=n%10;
			for(int i=1 ; i<=d ; i++)
			{
				if(d%i==0)
				{
					fact=fact*i;
				}
			}
			System.out.println(fact);
			n=n/10;
		}

		//Q. Display reverse number ?
		int n=?;
		int rev=0;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
		System.out.println(rev);

		//Q. palindrome number ?
		//if given number is same as its reverse 
		int n=?,rev=0,temp=n;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
		if(rev==temp)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

		//Q. Strong number
		//sum of factorials of individual digits of given number is equals to same number
		int n=?,sum=0,fact=1,temp=n;
		while(n!=0)
		{
			int d=n%10;
			for(int i=1 ; i<=d ; i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not");
		}

		//Q. To display first digit in given number ?
		int n=?;
		while(n>=10)
		{
			n=n/10;
		}
		System.out.println(n);

		//Q. find the power value of given number ?
		int n=?,p=?,res=1;
		for(int i=1 ; i<=p ; i++)
		{
			res=res*n;
		}
		System.out.println(res);
			
				
			
		
		
		
	}

}
