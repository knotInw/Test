package Blah;

import java.util.Scanner;
	
public class Test
{
	public static void main(String[] args) 
	{
	
			Scanner scan = new Scanner(System.in);
		    System.out.print("Input row number of pyramid : ");
		        int row = scan.nextInt();
		        int row1 = (row-1)*2;
		        int row2 = row;
		        int x = 0;
		        int z = 0;
		        
		        while(row>0)
			        {
					    for(int a=1;a<row;a++)
						    {
						    	System.out.print(" ");
						    }
					    
					    System.out.print("$");
					    if(row2%2==0)
					    {
					    	for(x=row2;0<x;x--)
					    	{
					    		System.out.print(" ");
					    	}
					    	System.out.print("$");
					    }
					    else
					    {
					    	
					    }
					    
						    if(row==1)
							    {
						    		for(int b=0;b<row1;b++)
							    		{
							    			System.out.print(" $");
							    			b++;
							    		}
							    }
						    System.out.println();
						    row--;
			        }
	}
}
