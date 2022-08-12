package Rajni;

import java.util.Scanner;

//Finds Factorial of a number


public class Factorial {
	
		  public static void main(String[] args){
		    Scanner reader = new Scanner(System.in);
		    System.out.println("Enter a number: ");
		    int num= reader.nextInt();
		    System.out.print(num+"!= "+findFactorial(num));
		  }
		    
		
		  public static int findFactorial(int n){
		    for(int i=n;i>1;i--) n*=(i-1);
		    return (n==0)?1:n;
		    
		  }	
}




