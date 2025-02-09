package numbers;

public class ArmstrongNumber
{
	public static void main(String[] args) 
	{
		int n=153,p=0,t=n,t1=n,sum=0;
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
			System.out.println(n+" is Armstrong");
		else
			System.out.println(n+" is Not Armstrong");
	}
}