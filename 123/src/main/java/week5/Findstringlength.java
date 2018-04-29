package week5;

import java.util.Scanner;

public class Findstringlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);  
   System.out.println("Enter input string");  
   String name=sc.next();  
   sc.close();
   int temp=0;
   int cht = 0;
   for(int i=0;i<name.length();i++)
   {
	   int verify = name.charAt(i);
   if(verify >= 48 && verify <= 57)
   {
	   temp = temp+1;
	}   
   else
   {
	   cht = cht+1;
   }
   }
   if(temp==5 && cht == 0)
   {
	   System.out.println("true");
	   
   }
   else
	   
   {
	   System.out.println("false"); 
   }

}
}
