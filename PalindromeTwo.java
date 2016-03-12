public class PalindromeTwo{
	public static void main(String[] args){
		String str = "Anne, I vote more cars race Rome-to-ViennaAnne, I vote more cars race Rome-to-Vienna";
		String newStr = str.replaceAll("[^a-zA-Z	]","");
		StringBuilder sb = new StringBuilder();
		for(int i=newStr.length()-1;i>-1;i--){
			sb.append(newStr.charAt(i));
		}
		if(sb.toString().equals(newStr)){
			System.out.println("hey!");
		}
	}
}