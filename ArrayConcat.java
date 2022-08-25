import java.util.Arrays;

public class ArrayConcat {
public static void main(String[] args)
{
   String[] Array = new String[4];
   // initial array values
   Array[0] = "I";
   Array[1] = "Love";
   Array[2] = "Black";
   System.out.println("Before Adding elements:" + Arrays.toString(Array));
   int items = 3;

   
   String newitem = "color";
   Array[items++] = newitem;
   System.out.println("Array after adding new element:" +  
             Arrays.toString(Array));


}
}
