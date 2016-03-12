public class AdditivePersistance{
	public static void main(String[] args){
		int num = 39;
		String strNum = String.valueOf(num);
		int count = 0;
		while(strNum.length() > 1){
			int sum = 1;
			for( int i = 0; i < strNum.length(); i++ ){
				sum *= strNum.charAt(i) - '0';
			}
			strNum=String.valueOf(sum);
			count++;
		}
	System.out.println(count);
	}
}