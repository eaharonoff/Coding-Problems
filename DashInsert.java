import java.*;
public class DashInsert{
	public static String dashInsert(String str){
		char[] arr = str.toCharArray();
		int strAsNum = Integer.parseInt(str);
		StringBuilder sb = new StringBuilder();
		for(int i = 0, j=1; j< arr.length;i++, j++){
			int num = Character.getNumericValue(arr[i]);
			int nextNum = Character.getNumericValue(arr[j]);
			if(num%2 !=0 && nextNum%2 != 0){
			sb.append(num);
			sb.append('-');
			}
			else{
				sb.append(num);
			}
		}
		sb.append(arr[arr.length-1]);
		String ans = sb.toString();
		return ans;

	}
	public static void main(String[] args){
		String example = "354793";
		String answer = dashInsert(example);
		System.out.println(answer);
	}

}