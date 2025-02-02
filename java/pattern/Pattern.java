/* 
=> patterns are used to display 2-dimensional 
=> we use nested for loop.
=> 	outer loop represents number of rows
	inner loop represents number of columns		
							
 for(int i=1 ; i<=5 ; i++)			    	  
 {					        	  cols(inner-loop)
 	for(int j=1 ; j<=5 ; j++)       		  j = 1 2 3 4 5
  	{					    	i=1   * * * * *
   		System.out.print("? ");		 rows   i=2   * * * * *
     	}				   (outer-loop)	i=3
        System.out.println();				i=4
 }							i=5

 print("*")	print("j")	print("i")	print(i%2)	print(j%2)
 * * * * *	1 2 3 4 5	1 1 1 1 1	1 1 1 1 1	1 0 1 0 1
 * * * * *	1 2 3 4 5	2 2 2 2 2	0 0 0 0 0	1 0 1 0 1
 * * * * *	1 2 3 4 5	3 3 3 3 3	1 1 1 1 1	1 0 1 0 1
 * * * * *	1 2 3 4 5	4 4 4 4 4	0 0 0 0 0	1 0 1 0 1
 * * * * *	1 2 3 4 5	5 5 5 5 5	1 1 1 1 1	1 0 1 0 1 
 
Note : code will same for all but must know what we print 
*/


//Q. print "+" symbol with "*" upto 9 rows & 9 cols 
for(int i=1 ; i<=9 ; i++)
{
	for(int j=1 ; j<=9 ; j++)
	{
		if(i==5 || j==5)
			System.out.print("* ");
		else
			System.out.print("  ");
	}
	System.out.println();
}
/*
====================

        *
        *
        *
        *
* * * * * * * * *
        *
        *
        *
        *
	
==================

* * * * * * * * *
*		*
*		*
*		*
*		*
*		*
*		*
*		*
* * * * * * * * *

===================

*
  *
    *
      *
        *
	  *
   	    *
	      *
		*
  
====================

                *
              *
            *
          *
        *
      *
    *
  *
*

====================

* * * * * * * * *
  *	      *
    *       *
      *   *
        *
      *	  *
    *       *
  *	      *
* * * * * * * * * 

=====================

* * * * *	*
	*	*
 	*	*
  	*	*
* * * * * * * * *
*    	*
*     	*
*     	*
*	* * * * *

======================

*       * * * * * 
*       *         
*       *         
*       *         
* * * * * * * * * 
        *       * 
        *       * 
        *       * 
* * * * *       * 

=======================


*               * 
  *           *   
    *       *     
      *   *       
        *         
        *         
        *         
        *         
        *         


==========================

        *         
      *   *       
    *       *     
  *           *   
*               * 
  *           *   
    *       *     
      *   *       
        *         

*/
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
