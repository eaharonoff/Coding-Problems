public class RunLength{
	public static String runL(String str){
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for(int i = 0, j = 1;j<str.length();i++, j++){
			char currentChar = str.charAt(j);
			char previousChar=str.charAt(i);
			if(currentChar==previousChar){
				count++;
			}
			else if(currentChar!=previousChar){
				sb.append(Integer.toString(count));
				sb.append(previousChar);
				count = 1;
			}
		}
		return sb.toString();
	}
	public static void main(String[] args){
		String str= "wwwavvw";
		String ans = runL(str);
		System.out.println(ans);
	}
}