package numbers;

public class Factorials 
{
	public static void main(String[] args) 
	{
		int n=7,fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
