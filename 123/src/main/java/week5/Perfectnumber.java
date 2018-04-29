package week5;

import java.util.Scanner;

public class Perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);  
		   System.out.println("Enter number");  
		   int input=sc.nextInt();  
		   sc.close();
		   int temp=0;
		for(int i=1;i<input;i++)
		{
			if(input%i==0)
			{
				temp = temp+i;
			}
		}
		if(temp == input)
		{
			System.out.println("It is a perfect number");
		}
		else
		{
			System.out.println("It is not a perfect number");
		}

	}

}
