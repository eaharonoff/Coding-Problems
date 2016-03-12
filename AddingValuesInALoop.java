import java.util.Scanner; 
public class AddingValuesInALoop{
	
	public static void main ( String []args){
	
		Scanner keyboard = new Scanner (System.in);
		System.out.println("I will add up the numbers you give me.");
		int first;
		int second;
		int sum=0;
	
		System.out.println("Please give me FIRST number: ");
		first = keyboard.nextInt();
		System.out.println("Please give me 2nd num: ");
		second = keyboard.nextInt();
		sum = first+second;
		System.out.println("Sum so far is: " + sum);

		while(second!=0){
			System.out.println("Please give me another num: ");
			second = keyboard.nextInt();
			sum += second;
			System.out.println("Sum so far is: " + sum);
		}

		double x = 0.4;
		int y = 2;

		System.out.println(x*y);

	}
}