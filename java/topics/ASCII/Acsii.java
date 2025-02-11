package ASCII;
/*

 => ACSII stands for 
 => using ASCII character set we can represent alphabets,
 	digits, symbols using constant int values.
 => using character system only we can convert the character 
 	into binery data that machine will understand
 	
 	A-65	a-97	0-48	#-35
 	B-66	b-98	1-49	$-36
 	...	...	...	...
 	Z-90	z-122	9-57	...

----------------------------------------------------------------
 Q. converting char to int & int to char?
 
 A. System.out.println("ACSII values of upperCase alphabets :");
	for(char ch='A';ch<='Z';ch++)
	{
		System.out.println(ch+" : "+(int)ch);
	}
	System.out.println("ASCII set :");
	for(int i=0;i<=256;i++)
	{
		System.out.println(i+" : "+(char)i);
	}
----------------------------------------------------------------
	int->char
	int x=65;
	char ch=(char)x;
	
	upper->lower			
	char x='A';		A=>65+32=97(a)
	char y=(char)(x+32);	B=>66+32=98(b)
	
	char->int
	char ch='a';
	int x=(int)ch;
	
	lower->upper
	char x='a';
	char y=(char)(x-32);
	
	char ch1='1';
	char ch2='2';
	char ch3='3';
	int sum=(int)ch1+(int)ch2+(int)ch3;
	print(sum);		=>49+50+51=150
	
	char ch1='1';	'0'=>48-48=0
	char ch2='2';	'1'=>49-48=1
	char ch3='3';
	
	int sum=(ch1-48)+(ch2-48)+(ch3-48);
	print(sum);
----------------------------------------------------------------
 Q. sum of digits in char array ?
 A.		char[] arr = {'a','b','c','@','3','5','6','$'};
		int sum=0;
		for(char ch:arr)
		{
			if(ch>='0' && ch<='9')
			{
				sum=sum+(ch-48);
			}
		}
		System.out.println(sum);

----------------------------------------------------------------
 Q. difference b/w Strings & Arrays

 A.	char[] arr = {'a','b','c','@','3','5','6','$'};
	System.out.println("Array length : "+arr.length);
	System.out.println("First char : "+arr[0]);
	System.out.println("last char : "+arr[arr.length-1]);
	
	String word="abc@356$";
	System.out.println("String length : "+word.length());
	System.out.println("First char : "+word.charAt(0));
	System.out.println("last char : "+word.charAt(word.length()-1));
----------------------------------------------------------------
 Q. Display String char by char ?
 
 A. String word="sriram";
	for(int i=0;i<=word.length()-1;i++)
	{
		System.out.println(word.charAt(i));
	}
	
	//reverse
	for(int i=word.length()-1;i>=0;i--)
	{
		System.out.println(word.charAt(i));
	}
----------------------------------------------------------------
 Q. Display Array of Strings ?
 A. String[] arr= {"abc","xyz","pqr","lmn"};
	for(String x:arr)
	{
		System.out.println(x);
	}
----------------------------------------------------------------	
 Q. Display length of each String in array
 A. String[] arr= {"c++","Java","python","Android","PHP"};
	for(String x:arr)
	{
		System.out.println(x+" : "+x.length());
	}
----------------------------------------------------------------	
 Q. Display first & last character of String in array
 A. String[] arr= {"c++","Java","python","Android","PHP"};
	for(String x:arr)
	{
		System.out.println(x.charAt(0)+" : "+x.charAt(x.length()-1));
	}
----------------------------------------------------------------	
 Q. Display last characters of each string in reverse order ?
 A. String[] arr= {"c++","Java","python","Android","PHP"};
	for(int i=arr.length-1;i>=0;i--)
	{
		String s=arr[i];
		System.out.println(s.charAt(s.length()-1));
	}
----------------------------------------------------------------	
 Q. Display each String in reverse order
 A. String[] arr= {"c++","Java","python","Android","PHP"};
	for(String s:arr)
	{
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}
----------------------------------------------------------------


*/
public class Acsii 
{
	public static void main(String[] args) 
	{
		String[] arr= {"c++","Java","python","Android","PHP"};
		for(String s:arr)
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				System.out.print(s.charAt(i));
			}
			System.out.println();
		}
	}

}
