public class ArithGeo2{
	public static boolean geo(int[] arr){
		int pattern = arr[1]/arr[0];
		for(int i = 1;i<arr.length;i++){
			if(arr[i]!=arr[i-1]*pattern){
				return false;
			}
		}
		return true;
	}

	public static boolean arith(int[] arr){
		int pattern = arr[1]-arr[0];
		for(int i = 1; i<arr.length;i++){
			if(arr[i]!=arr[i-1]+pattern){
				return false;
			}
		}
		return true;
	}

	public static String arithGeo(int[] arr){
		if (geo(arr)){
			return "geometric";
		}
		else if (arith(arr)){
			return "arithmetic";
		}
		else return "-1";
	}


	public static void main(String[] args){
		int[] arr = {1,3,5,7,9,10,12,14};
		System.out.println(arithGeo(arr));
	}
}