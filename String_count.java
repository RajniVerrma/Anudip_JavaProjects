package Rajni;

public class String_count {

    public static void main(String[] args) {
    String s="Rajni  Verma";
    char a[]=s.toCharArray();
    int count=0;
    for(int i=0;i<a.length;i++)
    {
        if(a[i]!=' ')
        {
            count++;
            
        }
    }
    System.out.println("Without space  given string: " +count+" ");
    
    
   //With Space
    System.out.print("with space given string: "+a.length+ " ");
        
    }
}
