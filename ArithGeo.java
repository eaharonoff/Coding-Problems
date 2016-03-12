public class ArithGeo{
	public static void main(String[] args){
int[] arr = {5,10,15};
int difference = 0;
  int geometric = 0;
  String patternIs = "";
    for(int i=0, j=1, k=2; k<arr.length; i++, j++, k++){
    int first = arr[i];
    int second = arr[j];
    int third =arr[k];
    difference = second - first;
    geometric = second/first;
      if(third-second == difference){
      patternIs = "Arithmetic";
      }
      else if(third/second == geometric){
      patternIs = "Geometric";
      }
      else{
      patternIs = "-1";
      }
    }
    

		System.out.println(patternIs);
	}
}