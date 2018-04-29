package week5;

import java.util.Scanner;

public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);  
		   System.out.println("Enter number");  
		   int input=sc.nextInt();  
		   sc.close();
		   int i,j,k;
		   if(input%2 ==0)
		   {
			   System.err.println("please provide odd");
		   }
		   else
			   {
			   for (i = 1; i <= input; i++) {
		            for (j = 1; j <= input - i; j++)
		                System.out.print(" ");
		 
		            for (k = 1; k <= i; k++)
		                System.out.print(k + " ");
		 
		            System.out.println();
		            i++;
		        }
		 
		        for (i = 2; i <= input-1; i++) {
		            for (j = 1; j <= i; j++)
		                System.out.print(" ");
		 
		            for (k = 1; k <= input - i; k++)
		                System.out.print(k + " ");
		 
		            System.out.println();
		            i++;
		        }

			    }

	}

}
