public class LetterCapital{
	public static void main(String args[]){
		String str = "hello world. how are you?";
		String stringArray[] = str.split(" ");
		for(int i=0; i<=stringArray.length-1; i++){
			stringArray[i].toUpperCase();
		}
		String capitalString=stringArray.toString();
		System.out.println(capitalString);
	}
}