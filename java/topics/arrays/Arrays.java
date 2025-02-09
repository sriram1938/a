package arrays;

/*
 		*** ARRAY ***
   		=============
----------------------------------------------------------------
 => Primitive variables store only one value at a time.
 => Array variables can be used to store multiple values but 
  	same data types.
 => we can access array elements using their index values.
 => indexing starts with '0' to 'arr.length-1'
 
 	int[] arr = {3,7,4,2,5};
 		
 	arr.length : 5;
 	first ele : arr[0];
 	last ele : arr[arr.length-1];
----------------------------------------------------------------		
 Q. Display length, first, & last element in Array ?
 A. public class Code
    {
 	public static void main(String[] args)
 	{
	 	int[] arr = {3,7,4,5,8,6};
		 int n = arr.length;
		 System.out.println("length : "+n);
		 System.out.println("First ele : "+arr[0]);
		 System.out.println("Last ele : "+arr[n-1]);
	 	}
 	}
---------------------------------------------------------------- 		
 Q. Sum of first & last ele in Array ?
 A.	public class Code
 	{
 		public static void main(String[] args)
 		{
 			int[] arr = {3,7,4,5,8,6};
 			System.out.println(arr[0]+arr[arr.length-1]);
 		}
 	}
---------------------------------------------------------------- 	
 Q. Check first ele is Even or Not ?
 A.	public class Code
 	{
 		public static void main(String[] args)
 		{
 			int[] arr = {3,7,4,5,8,6};
 			if(arr[0]%2==0)
 				System.out.println("first ele is Even");
 			else
 				System.out.println("Not even");
 		}
 	}
---------------------------------------------------------------- 	
 Q. Display Array elements using for loop ?
 A. 	for(int i=0;i<=arr.length-1;i++)
 	{
 		System.out.println(arr[i]);
 	}
---------------------------------------------------------------- 	
 Q. Display in reverse order ?
 A.	for(int i=arr.length-1;i>=0;i--)
 	{
 		System.out.println(arr[i]);
 	}
 	
---------------------------------------------------------------- 

			*** for-each ***
   			================
----------------------------------------------------------------
 => it is called enhanced for loop
 => using it, we can easily process elements of array
 => limitations is for each loop can process elements
  	in forward direction only
 => for(int x : arr)
 	{
 		System.out.println(x);
 	}
  note: if process all ele in array then take for each
 	otherwise take for loop
----------------------------------------------------------------		
 Q. Sum of all elements in array ?
 A. 	int[] arr = {3,7,4,5,8,6};
 	int sum=o;
 	for(int x : arr)
 	{
 		sum=sum+x;
 	}
 	System.out.println(x);
---------------------------------------------------------------- 	
 Q. Count even elements in array ?
 A. 	int count=0;
 	for(int x : arr)
 	{
 		if(x%2==0)
 			count++;
 	}
 	System.out.println(x);
---------------------------------------------------------------- 	
 Q. Display even elements in reverse order ?
 A. 	for(int i=arr.length-1;i>=0;i++)
 	{
 		if(arr[i]%2==0)
 			System.out.println(arr[i]);
 	}
---------------------------------------------------------------- 	
 Q. Display first even number & last odd number with their index value
 A. 	for(int i=0;i<=arr.length-1;i++)
 	{
 		if(arr[i]%2==0)
 		{
 			System.out.println("index value : "+i);
 			System.out.println("first even : "+arr[i]);
 			break;
 		}
 	}
 	
 	for(int i=arr.length-1;i>=0;i--)
 	{
 		if(arr[i]%2!=0)
 		{
 			System.out.println("index value : "+i);
 			System.out.println("last odd : "+arr[i]);
 			break;
 		}
 	}
---------------------------------------------------------------- 	
 Q. Display large element in array ?
 A. 	int large = arr[0];
 	for(int i=1;i<=arr.length-1;i++)
 	{
 		if(arr[i]>large)
 			large=arr[i];
 	}
---------------------------------------------------------------- 	
 Q. Display largest element along with location ?
 A. 	int large = arr[0],loc=0;
 	for(int i=1;i<=arr.length-1;i++)
 	{
 		if(arr[i]>large)
 		{
 			large = arr[i];
 			loc = i;
 		}
 	}
---------------------------------------------------------------- 	
 Q. swap first & second elements of array ?
 A.	int[] arr = {3,7,4,5,8,6};
 	int temp = arr[0];
 	arr[0] = arr[1];
 	arr[1] = temp;
 	
 	System.out.println("after swap :");
 	for(int ele : arr)
 	{
 		System.out.print(ele+" ");
 	}
---------------------------------------------------------------- 	
 Q. swap first & last ?
 A. int[] arr = {3,7,4,5,8,6};
 	int temp = arr[0];
 	arr[0] = arr[arr.length-1];
 	arr[arr.length-1] = temp;
 	
 	System.out.println("after swap :");
 	for(int ele : arr)
 	{
 		System.out.print(ele+" ");
 	}
---------------------------------------------------------------- 	
 Q. swap index ele with its adjacent ele only if index is valid ?
 A. int index = ?;
 	if(index>=0 && index<=arr.length-2)
 	{
 		int temp = arr[index];
 		arr[index] = arr[index+1];
 		arr[index+1] = temp;
 	}
 	else
 	{
 		System.out.print("Invalid given");
 	}
---------------------------------------------------------------- 	
 Q. swap specified locations elements ?
 A. int x=?,y=?;
 	if((x>=0 && x<=arr.length-1)&&(y>=0 && y<=arr.length-1)&&(x!=y))
 	{
 		int temp = arr[x];
 		arr[x] = arr[y];
 		arr[y] = temp;
 	}
---------------------------------------------------------------- 	
 Q. swap first even & last odd ?
 A. int x=-1,y=-1;
 	for(int i=0;i<=arr.length-1;i++)
 	{
 		if(arr[i]%2==0)
 		{
 			x = i;
 			break;
 		}
 	}
 	for(int i=arr.length-1;i>=0;i--)
 	{
 		if(arr[i]%2!=0)
 		{
 			y = i;
 			break;
 		}
 	}
 	int temp = arr[x];
 	arr[x] = arr[y];
 	arr[y] = temp;
 	
 	System.out.print("after swap :");
 	for(int z : arr)
 	{
 		System.out.print(z+" ");
 	}
---------------------------------------------------------------- 	
 Q. swap small & large elements ?
 A. int large = arr[0],l=0;
 	for(int i=1;i<=arr.length-1;i++)
 	{
 		if(arr[i]>large)
 		{
 			large = arr[i];
 			l = i;
 		}
 	}
 	
 	int small = arr[0],s=0;
 	for(int i=1;i<=arr.length-1;i++)
 	{
 		if(arr[i]<small)
 		{
 			small = arr[i];
 			s = i;
 		}
 	}
 	
 	int temp = arr[l];
 	arr[l] = arr[s];
 	arr[s] = temp;
 	 			
----------------------------------------------------------------
*/
public class Arrays 
{
	public static void main(String[] args) 
	{
		String res = Check.isEven(13);
		System.out.println(res);
		Main.meth1();
	}
}
class Main
{
	public static void meth1()
	{
		System.out.println("[");
	}
}
class Check 
{
	public static String isEven(int n)
	{
		if(n%2==0)
		{
			return "Even Number";
		}
		else
			return "Not Even Number";
	}
}

