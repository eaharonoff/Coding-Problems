public class SumOfInt{
	public static int SumOfInt(int[] arr){
		int sum = 0;
    for(int i = 1;i<=arr[0];i++){
        sum+=arr[i];
    }
        return sum;
	}
public static void main(String[] args){
	int[] arr = {3,1,2,3};

	System.out.println(SumOfInt(arr));
}
}