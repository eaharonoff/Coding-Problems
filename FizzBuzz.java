public class FizzBuzz{
	public static String fizzIt(int num){
		if(num%3==0){
			if(num%5==0){
				return "fizzbuzz";
			}
			else return "fizz";
		}
		else if(num%5==0 && num%3!=0){
			return "buzz";
		}
		else return Integer.toString(num);

	}
	
	public static void main(String[] args){
		for(int i = 1; i<101; i++){	
			System.out.println(fizzIt(i));
		}
	}
}