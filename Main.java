import java.util.*;
class Main { 
    public static void main(String[] args) {
    	String firstString = ("aretheyhere");
    	String secondString = ("yestheyarehere");
    	String newString =  firstString + secondString;
 		StringBuilder sb = new StringBuilder();
 		Set<Character> seen = new HashSet<Character>();
			for(int i=0; i<newString.length();++i){
				char c = newString.charAt(i);
					if (!seen.contains(c)){
						seen.add(c);
						sb.append(c);
					}

			}
		String twoToOne =sb.toString();
		
	}
 
}