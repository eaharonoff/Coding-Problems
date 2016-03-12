public class ChangingSequence{
	public static void main(String[] args){
		int[] arr = {1,2,4,6,4,3,1};
		int first=arr[0];
		int second=arr[1];
		if(first<second){
			for(int i = 1;i<arr.length;i++){
			if(arr[i]<arr[i-1]){
				System.out.println(arr[i-1]);
			}	
			}
		}
		else if(first>second){
			for(int i =1; i<arr.length;i++){
				if(arr[i]>arr[i-1]){
					System.out.println(arr[i-1]);
				}
			}
		}
	}
}