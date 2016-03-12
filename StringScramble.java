public class StringScramble{
	public static boolean StringScramble(String str1, String str2){
		for(int i = 0;i<str2.length();i++){
			if(str1.indexOf(str2.charAt(i))<0){
				return false;
			}
		}
		return true;

	}
	public static void main(String[] args){
		String str1= "sfowdflerod";
		String str2 = "";
		System.out.println(StringScramble(str1,str2));
	}
}