package Rajni;
/*
program to remove spaces from a string


Given a string as input, output it without spaces.

For example:
string = "Raj ni Ve rma"
result = "RajniVerma"
*/

import java.util.Scanner;
public class RemoveSpaces {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        
	        System.out.print("Enter a String: ");
	        String word = in.nextLine();
	        
	        String[] wordArray =  word.split(" ");
	        
	        for(String x : wordArray){
	            System.out.print(x);
	        }
	        
	    }
}


