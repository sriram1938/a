package numbers;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		int n=151,temp=n,rev=0;
		while(n!=0)
		{
			int d=n%10;
			rev=(rev*10)+d;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not Palindrome");
		}
	}
}