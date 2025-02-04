package numbers;

public class Perfect {

	public static void main(String[] args) 
	{
		
		//sum of factors except itself is equal to same number
		
				int n=23 , sum=0;
				for(int i=1 ; i<n ; i++)
				{
					if(n%i==0)
					{
						sum=sum+i;
					}
				}
				if(sum==n)
				{
					System.out.println(n+" is perfect");
				}
				else
				{
					System.out.println(n+" is Not perfect");
				}
				
		//from 1 to 1000
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

}
