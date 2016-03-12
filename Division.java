public class Division{
	public static void main(String[] args){
		int num1=24;
		int num2=40;
		int gcf=0;
		for(int i =1; i<=num1; i++){
			if(num1%i==0 && num2%i==0){
				gcf=i;
			}
		}
		System.out.println(gcf);
	}
}