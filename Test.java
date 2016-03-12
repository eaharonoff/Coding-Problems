public class Test{
	public static void main (String[] args) {  
    // keep this function call here     
    	String str = "hello";  
		StringBuilder sb = new StringBuilder();
  		char[] chars = str.toCharArray();
    	for(int i=str.length()-1;i>=0;--i){
    		char c = chars[i];
    		sb.append(c);
    	}
    	System.out.println("the letter is: " + sb);
	}
}