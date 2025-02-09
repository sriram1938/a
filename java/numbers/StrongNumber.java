package numbers;

public class StrongNumber 
{
	public static void main(String[] args) 
	{
		int n=145,sum=0,temp=n;
		while(n!=0)
		{
			int fact=1;
			int d=n%10;
			for(int i=1;i<=d;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("strong");
		}
		else
		{
			System.out.println("not");
		}
	}
}