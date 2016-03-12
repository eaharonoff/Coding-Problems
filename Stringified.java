import java.text.DecimalFormat;
public class Stringified{
	public static void main(String[] args){
		int num1 = 1;
		int num2 = 10;
		long result = Math.round(num1/(num2*1.0));
		/* System.out.println(result);*/

		DecimalFormat withComma = new DecimalFormat("#,###");
		System.out.println(withComma.format(result));
	}
}