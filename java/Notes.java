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
		
		

	}

}
