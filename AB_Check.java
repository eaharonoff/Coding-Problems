public class AB_Check{
	public static void main(String[] args){
		String str= "bbbza";
		String newString= str.replaceAll("[ ]","");
		int length = str.length();
		for(int i =0, j=4; j<length; i++, j++){
			char letter = str.charAt(i);
			char secondLetter = str.charAt(j);
			if(letter=='a' && secondLetter=='b'){
				System.out.println("yay!");
			}
			else if(letter=='b' && secondLetter=='a'){
				System.out.println("also yay!");
			}
			
		}
	}
	
}