public class meanMode{
	public static int modeCheck(int[] arr){
		int count= 0;
		int maxCount = 0;
		int mode = 0;
		for(int i = 0; i<arr.length-2;i++){
			for(int j = i+1; j<arr.length-1;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count>maxCount){
				maxCount= count;
				mode=arr[i];
			}
		}

		return mode;

	} 

	public static int meanCheck(int[] arr){
		int sum = 0;
		int length = arr.length-1;
		for(int i = 0; i<arr.length; i++){
			sum+=arr[i];
		}
		int mean = sum/length;

		return mean;
	}

	public static void main(String[] args){
		int[] example = {4,4,4,6,2};
		int theMode = modeCheck(example);
		int theMean = modeCheck(example);

		if(theMode == theMean){
			System.out.println("1");
		}
		else{
			System.out.println("0");
		}
	}
}