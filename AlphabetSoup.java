import java.util.Arrays;
public class AlphabetSoup{
	public static char[] Alphabetize(String str){
		char[] arr = str.toCharArray();
		Arrays.sort(arr);

		return arr;
	}
	public static void main(String[] args){
		String str = "hello";
		System.out.println(Alphabetize(str));
	}

}