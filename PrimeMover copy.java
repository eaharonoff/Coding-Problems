public class PrimeMover{
	public static int PrimeMover(int num) { 
    int number = 2;
    int count = 0;
    
    while(count<num){
      if(isPrime(number)){
      	count++;
        if(count==num){
        	break;
        }
      }
      number++;
    }
    
    return number;
  } 
  
  public static boolean isPrime(int number){
    
    for(int i =2; i<number;i++){
      if(number%i==0){
      return false;
      }
    }
    return true;
  }
	public static void main(String[] args){
		int num = 9;
		System.out.println(PrimeMover(num));
	}
}
