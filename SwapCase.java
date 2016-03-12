public class SwapCase{
	public static void main(String[] args){
		String hello = "HELL2O world";
		char[] ch = hello.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i<ch.length; i++){
			boolean upperCase = ch[i]>64 && ch[i]<90;
			boolean lowerCase = ch[i]>96 && ch[i]<123;
			if(upperCase){
				char lowered = Character.toLowerCase(ch[i]);
				sb.append(lowered);
			}
			else if(lowerCase){
				char upper = Character.toUpperCase(ch[i]);
				sb.append(upper);
			}
			else sb.append(ch[i]);
		}
		String ans = sb.toString();
		System.out.println(ans);
	}
}