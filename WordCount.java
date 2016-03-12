public class WordCount{
	public static void main(String[] args){
		int count = 1;
		String str="yo and woh and toe and loe";
		for(int i=0;i<str.length();i++){
			char theSpace=str.charAt(i);
			if(theSpace==' '){
				count++;
			}
		}
		System.out.println(count);
	}
}