public class PrimeMover{
	public static boolean primeNumber(int number){
		if(number==2 || number==3 || number==5 || number==7){
			return true;
		}
		if(number%2==0 || number%3==0 || number%5==0
			|| number%7==0){
			return false;
		}
		else return true;
	}
	public static void main(String[] args){
		int num = 16;
		int count= 0;
		int prime = 2;
		while(count<num){
			if(primeNumber(prime)){
				count++;
				if(count==num){
					break;
				}
			}
			prime++;
		}
		System.out.println(prime);
	}
}