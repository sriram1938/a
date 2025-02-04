package patterns;

public class Ram {

	public static void main(String[] args) {
		for(int i=1 ; i<=9 ; i++)
		{
			for(int j=1 ; j<=9 ; j++)
			{
				if((i==1&&j>=2&&j<=8) || (j==1&&i>=2&&i<=4) || (i==5&&j>=2&&j<=8) || (j==9&&i>=6&&i<=8) || (i==9&&j>=2&&j<=8))
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for(int s=1 ; s<=2 ; s++)
			{
				System.out.print(" ");
			}
			for(int k=1 ; k<=9 ; k++)
			{
				if(k==1 || (i==1&&k<=8) || (k==9&&i>=2&&i<=4) || (k==9&&i>=6) || (i==5&&k<=8))
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for(int s=1 ; s<=2 ; s++)
			{
				System.out.print(" ");
			}
			for(int l=1 ; l<=9 ; l++)
			{
				if(i==1 || i==9 || l==5)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		
		}
		System.out.println();
		System.out.println();
		System.out.println();
		for(int i=1 ; i<=9 ; i++)
		{
			for(int j=1 ; j<=9 ; j++)
			{
				if(j==1 || (i==1&&j<=8) || (j==9&&i>=2&&i<=4) || (j==9&&i>=6) || (i==5&&j<=8))
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for(int s=1 ; s<=2 ; s++)
			{
				System.out.print(" ");
			}
			for(int k=1 ; k<=9 ; k++)
			{
				if(k==1&&i>=2 || (i==1&&k<=8&&k>=2) || (k==9&&i<=4&&i>=2) || (k==9&&i>=6) || (i==5))
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for(int s=1 ; s<=2 ; s++)
			{
				System.out.print(" ");
			}
			for(int l=1 ; l<=9 ; l++)
			{
				if((l==1) || (i==l&&i<=5&&l<=5) || l==9 || (i+l==10&&i<=5&&l>=5))
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
