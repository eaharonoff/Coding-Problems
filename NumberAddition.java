public class NumberAddition{
	public static void main(String[] args){
		String str = "1wo Ho33uses";
		String[] arr = (str.split("\\D+"));
		int sum = 0;
		for(int i = 0; i<arr.length; i++){
          if(!(arr[i].equals(""))){
			int num = Integer.parseInt(arr[i]);
			sum+=num;
          }
      	}

		System.out.println(sum);
		
	}
}