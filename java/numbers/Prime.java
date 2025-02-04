package numbers;

public class Prime {
	public static void main(String[] args) {


		//the number which is having only 2 factors 

		int n=10 , count=0;
		for(int i=1 ; i<=n ; i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(n+" is prime");
		}
		else
		{
			System.out.println(n+" is Not prime");
		}

		//from 1 to 1000
		
		for(int n1=1;n1<=1000;n1++) 
		{
			int c=0;
			for(int i=1 ; i<=n1 ; i++)
			{
				if(n1%i==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.print(n1+",");
			}
		}
	}
}
