public class LetterCapitalize{
	public static void main(String[] args){
		String str = "hello, oh";
		char[] ch = str.toCharArray();
		ch[0]=Character.toUpperCase(ch[0]);	
		for(int i=1;i<ch.length-1;i++){
			if(ch[i-1]==' '){
				ch[i]=Character.toUpperCase(ch[i]);
			}
		}	
		System.out.println(ch);
	} 
}