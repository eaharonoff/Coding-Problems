public class FirstFactorial{
	public static void main(String[] args){
		int num = 5; // test number, it could be any number.
		int factorial = 1;
		for(int i =num; i>0;i--){
			factorial*=i;
		}	
		System.out.println(factorial);
	}
}