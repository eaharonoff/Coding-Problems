public class Palindrome{
	public static void main(String[] args){
		String str = "never odd or even";
    	String reversed = "";
    	str = str.replaceAll(" ","");
    	System.out.println(str);
    	for(int i=str.length()-1;i>=0;i--){
    	reversed+=str.charAt(i);
    	}
    
    	if(str.equals(reversed)){
    	System.out.println("true");
    }
		
	}
}