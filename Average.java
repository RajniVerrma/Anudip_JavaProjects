package Rajni;
import java.util.Scanner;


class Average{
	// Function that returns the average of an array.
	static double averageCal(int a[], int n)
	{
	    // Find sum of array element
	    int sum = 0;
	    for (int i = 0; i < n; i++)
	    {
	        sum += a[i];
	    }
	    System.out.println("The total sum of all the elements "+sum);
	    return (double)sum / n;
	}
	 
	
	public static void main (String[] args)
	{
	    Scanner a=new Scanner(System.in);
	    
	    int n; 
	    System.out.println("Enter the total number of elements in the array ");
	    n=a.nextInt();  //Initialize the array size
	    
	    int arr[] = new int[n];    //Declare array
	    System.out.println("Enter the array elements ");
	    for(int i=0;i<n;i++)      //Initialize the array
	    {
	        arr[i]=a.nextInt();
	    }
	 
	    System.out.println("The average of all the elements  is "+averageCal(arr, n));
	}
	}


