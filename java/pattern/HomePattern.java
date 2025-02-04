package patterns;

public class HomePattern {

	public static void main(String[] args) {
		for(int i=1 ; i<=7 ; i++)
		{
			for(int j=1 ; j<=11 ; j++)
			{
				if((i==7) || (i==5) || ((i==6)&&(j==4||j==8||j==11||j==1)) || ((i==4)&&(j%2==0)) || ((i==3)&&(j==3||j==5||j==7||j==9)) || ((i==2)&&(j==5||j==7)) || ((i==1)&&(j==6)))
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

	}

}

/*
 * output :
 * 
 
          *           
        *   *         
    *   *   *   *     
  *   *   *   *   *   
* * * * * * * * * * * 
*     *       *     * 
* * * * * * * * * * * 
 
 
 
*/
