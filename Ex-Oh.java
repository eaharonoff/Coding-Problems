public class Ex-Oh{
	public static void main(String[] args){
		int x_count=0;
		int y_count=0;
		String str="xxyyxyxy";
		for(int i=0;i<str.length();i++){
			char letter = str.charAt(i);
			if(letter=='x'){
				x_count++;
			}
			else{
				y_count++;
			}
		}
		if(x_count==y_count){
			System.out.println("true");
		}
		else System.out.println("false");
	}
}