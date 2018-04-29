package week5;

import java.util.Arrays;
import java.util.Scanner;

public class Numberscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter the number");
		 String input=cs.next();  
		   cs.close();
	char temp=0;
	char num[] = input.toCharArray();		
	for(int i=0; i<input.length(); i++) {
		for(int j=i+1; j<input.length(); j++) {
		if(num[i]>num[j]) {
		temp=num[i];
		num[i]=num[j];
		num[j]=(char)temp;
		}
		}
		}
	System.out.println(num);
	
		
		
	}

}
