package ManualPatterns;

public class Stars 
{
	public static void main(String[] args) 
	{
		/*
				 * 
				 * * 
				 * * * 
				 * * * * 
				 * * * * *
		 */
		System.out.println("=========");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		/*
				 * * * * * 
				 * * * * 
				 * * * 
				 * * 
				 * 
		 */
		System.out.println("=========");
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		/*
			         	* 
				      * * 
				    * * * 
				  * * * * 
				* * * * * 
		 */
		System.out.println("=========");
		for(int i=1;i<=5;i++)
		{
			for(int s=1;s<=5-i;s++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		/*
			 	* * * * * 
				  * * * * 
				    * * * 
				      * * 
				        * 
		 */
		System.out.println("=========");
		for(int i=5;i>=1;i--)
		{
			for(int s=1;s<=5-i;s++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		/*
		 		* 
				* * 
				* * * 
				* * * * 
				* * * * * 
				* * * * 
				* * * 
				* * 
				* 

		 */
		System.out.println("=========");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		/*
		 		* * * * * 
				* * * * 
				* * * 
				* * 
				* 
				* * 
				* * * 
				* * * * 
				* * * * * 
		 */
		System.out.println("=========");
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=2;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		/*
		 		* * * * * 
				  * * * * 
				    * * * 
				      * * 
				        * 
				      * * 
				    * * * 
				  * * * * 
				* * * * * 
		 */
		System.out.println("=========");
		for(int i=5;i>=1;i--)
		{
			for(int s=1;s<=5-i;s++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=2;i<=5;i++)
		{
			for(int s=1;s<=5-i;s++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		/*
		 		*       
				**      
				* *     
				*  *    
				*   *   
				*    *  
				*     * 
				********
		 */
		System.out.println("=========");
		for(int i=1;i<=8;i++)
		{
			for(int j=1;j<=8;j++)
			{
				if(j==1||i==8||i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		/*
		 		********
				*     * 
				*    *  
				*   *   
				*  *    
				* *     
				**      
				*       
		 */
		System.out.println("=========");
		for(int i=1;i<=8;i++)
		{
			for(int j=1;j<=8;j++)
			{
				if(j==1||i==1||i+j==9)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		/*
		 		********
				 *     *
				  *    *
				   *   *
				    *  *
				     * *
				      **
				       *
		 */
		System.out.println("=========");
		for(int i=1;i<=8;i++)
		{
			for(int j=1;j<=8;j++)
			{
				if(j==8||i==1||i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		/*
		       			   *
					      **
					     * *
					    *  *
					   *   *
					  *    *
					 *     *
					********
		 */
		System.out.println("=========");
		for(int i=1;i<=8;i++)
		{
			for(int j=1;j<=8;j++)
			{
				if(j==8||i==8||i+j==9)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		/*
		         		* 
				      * * * 
				    * * * * * 
				  * * * * * * * 
				* * * * * * * * * 
		 */
		System.out.println("==================");
		for(int i=1;i<=5;i++)
		{
			for(int s=1;s<=5-i;s++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		/*
		         		*         
				      *   *       
				    *       *     
				  *           *   
				* * * * * * * * * 
		 */
		System.out.println("==================");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i==5||i+j==6||j-i==4)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		/*
		         		1 
				      2 2 2 
				    3 3 3 3 3 
				  4 4 4 4 4 4 4 
				5 5 5 5 5 5 5 5 5 
		 */
		System.out.println("==================");
		for(int i=1;i<=5;i++)
		{
			for(int s=1;s<=5-i;s++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		/*
		 		* * * * * * * * * 
				  *           *   
				    *       *     
				      *   *       
				        *         
		 */
		System.out.println("==================");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i==1||i==j||i+j==10)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}

			}
			System.out.println();
		}
		/*
		 		5 5 5 5 5 5 5 5 5 
				  4 4 4 4 4 4 4 
				    3 3 3 3 3 
				      2 2 2 
				        1 

		 */
		System.out.println("==================");
		for(int i=5;i>=1;i--)
		{
			for(int s=1;s<=5-i;s++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
