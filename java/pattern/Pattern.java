package sathya;

public class Pattern {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j==5 || i==5 || (j==1&&i<=5) || (i==1&&j>=5) || (i==9&&j<=5) || (j==9&&i>=5))
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if((i==j&&i<=5) || (i+j==10&&j>=5)|| (j==5&&i>=5))
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println();

		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if((i+j==6) || (j-i==4) || (i-j==4) || (i+j==14))
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
