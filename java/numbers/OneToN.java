package numbers;

public class OneToN 
{
	public static void main(String[] args) 
	{
		palindromes();
	}
	public static void armstrongNums()
	{
		for(int n=1;n<=100000000;n++)
		{
			int p=0,t=n,t1=n,sum=0;
			while(t!=0) 
			{
				t=t/10;
				p++;
			}
			while(t1!=0) 
			{
				int r=1;
				for(int i=1;i<=p;i++)
				{
					r=r*(t1%10);
				}
				sum=sum+r;
				t1=t1/10;
			}
			if(n==sum)
				System.out.println(n);
		}
	}
	/*---------------------------------------------*/
	
	public static void factorials()
	{
		for(int n=1;n<=30;n++)
		{
			int fact=1;
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			System.out.println(fact);
		}
	}
	/*---------------------------------------------*/
	
	public static void factors()
	{
		for(int n=1;n<=100;n++)
		{
			System.out.print(n+" factors : ");
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					System.out.print(i+",");
				}
			}
			System.out.println();
		}
	}	
	/*---------------------------------------------*/
	
	public static void palindromes()
	{
		for(int n=100;n<=1000;n++)
		{
			int n1=n,rev=0,temp=n;
			while(n1!=0)
			{
				int d=n1%10;
				rev=(rev*10)+d;
				n1=n1/10;
			}
			if(temp==rev)
				System.out.println(temp);
		}
	}
	/*---------------------------------------------*/
	
	public static void perfectNums()
	{
		for(int n1=1;n1<=1000;n1++)
		{
			int s=0;
			for(int i=1 ; i<n1 ; i++)
			{
				if(n1%i==0)
				{
					s=s+i;
				}
			}
			if(s==n1)
			{
				System.out.println(n1+" is perfect");
			}
		}
	}
	/*---------------------------------------------*/
	
	public static void primeNums()
	{
		for(int n=1;n<=1000;n++) 
		{
			int c=0;
			for(int i=1 ; i<=n ; i++)
			{
				if(n%i==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.print(n+",");
			}
		}
	}
	/*---------------------------------------------*/
	
	public static void strongNums()
	{
		for(int n=1;n<=100000;n++)
		{
			int n1=n, sum=0,temp=n;
			while(n1!=0)
			{
				int fact=1;
				int d=n1%10;
				for(int i=1;i<=d;i++)
				{
					fact=fact*i;
				}
				sum=sum+fact;
				n1=n1/10;
			}
			if(temp==sum)
				System.out.println(temp);
		}
	}
	/*---------------------------------------------*/
	
	public static void tables()
	{
		for(int n=3;n<=15;n++)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(n+" * "+i+" = "+(n*i));
			}
		}
	}
}