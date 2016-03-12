public class LongestWord{
	public static void main(String[] args){
		String str = "Argument goes here ";
		String[] wordsIntoParts = str.replaceAll("[^a-zA-Z ]","").split(" ");
		int largestWordLength = 0;
		String largestWord = "";
		for(int i=0;i<wordsIntoParts.length;i++){
			if(wordsIntoParts[i].length()>largestWordLength){
				largestWordLength=wordsIntoParts[i].length();
				largestWord=wordsIntoParts[i];

			}
			
		}
		System.out.println(largestWord);

	} 
}