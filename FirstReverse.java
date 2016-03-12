public class FirstReverse{
	public static void main(String[] args){
		String str = "hello";
		StringBuilder reversedString = new StringBuilder();
		String newString="";
		for(int i=str.length()-1;i>=0;i--){
		reversedString.append(str.charAt(i));
		}
		System.out.println(reversedString);
	}
}