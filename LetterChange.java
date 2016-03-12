public class LetterChange{
	public static void main(String[] args){
		String str = "hello345 hi";
		String modifiedString = "";
		for(int i=0;i<str.length();i++){
			char letter = str.charAt(i);
			char lowerLetter  = Character.toLowerCase(letter);
			int incrementBy = 1;
			int sizeOfAlphabet = 'z'-'a'; 
			if(lowerLetter>='a' && lowerLetter<='y') {
				modifiedString+=(char)(letter+incrementBy);
			}
			else if(lowerLetter=='z'){
				modifiedString+=(char)(letter-(sizeOfAlphabet-incrementBy));
			}
			else{
				modifiedString+=letter;
			}
			
		}
		String endWord = modifiedString.replaceAll("a","A").replaceAll("e","E").replaceAll("i","I").replaceAll("o","O").replaceAll("u","U");
		System.out.println(endWord);
	} 
}