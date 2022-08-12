package Rajni;

import java.util.*;
public class Main {
	
	// Function removes duplicate numbers from the array
	 
	 void removeDuplicates(int[] a)
	 {
	     LinkedHashSet<Integer> H = new LinkedHashSet<>();
	     for(int i=0;i<a.length;i++)
	         H.add(a[i]);
	     
	     // print array after deleting duplicate elements
	     for(Integer in : H)
	         System.out.print(" "+in);
	 }
	 
	 /* Driver program to test removeDuplicates */
	 public static void main(String args[])
	 {
	     int[] a = {1,2,2,99,3,1,4,7,4,2,3,1};
	     Main r = new Main();
	     r.removeDuplicates(a);
	 }
	 
}



