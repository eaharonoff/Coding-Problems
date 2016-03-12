public class PalindromeTwo{
	public static void main(String[] args){
		String str = "Racecar a34b";
		str.replaceAll("[^a-zA-Z ]","");
		System.out.println(str);
	}
}