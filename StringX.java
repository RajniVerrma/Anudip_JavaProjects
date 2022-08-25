
public class StringX {
   
	String firstFourChars = "12345678";   //input string
 
	//creating a method that return string containing X
      public String GetString() {
		
		if (firstFourChars.length() > 4) 
		{
			firstFourChars= firstFourChars.replace("1234", "xxxx");

		} 
	      return firstFourChars;
	      
        }
      
	public static void main(String... args) {
		StringX s = new StringX();  //creating object
		s.GetString();  //calling method
		
		System.out.println(s.GetString());
	}
}
