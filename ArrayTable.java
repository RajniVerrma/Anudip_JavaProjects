import java.util.Arrays;

public class ArrayTable {


	//creating method that display table.
	public  void display( int x [], String s []) {
		Arrays.sort(x);
		Arrays.sort(s);
		System.out.println("Name\tvalue");
		for (int i= 0; i<x.length;i++) {
		         System.out.println(s[i] + "\t" + x[i]);
			}
		}
	
	public static void main(String... args) {
		String[] name = {"Peter" , "Amy", "John" ,"Boyd","Cathy"};
		int[] values = {15,9, 14, 10, 12};
		ArrayTable t = new ArrayTable();
		t.display(values, name);
	}
	}
	

