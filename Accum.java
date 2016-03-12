public class Accum {
     public static char[] accum(String testString) {
     // your code
     char[] stringToCharArray = testString.toCharArray();
     return stringToCharArray;
    }
   
 	public static void main (String []args){
	String testString = "hello";
	char [] newArray; 

	for (char i: accum(testString)){
		char charUpper = Character.toUpperCase(i);
		char charLower = Character.toLowerCase(i);
		
		System.out.println(charUpper);
		System.out.println(charLower);

	}
	
}
}