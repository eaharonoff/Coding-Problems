import java.util.*; 
import java.io.*;

class Function {  
  String ArithGeo(int[] arr) { 
    if(arith(arr)){
      return "Arithmetic";
    }
    
    else if(geo(arr)){
      return "Geometric";
    }
    
    else{
      return "-1";
    }
  }
  private boolean arith(int[] arr) {
    int difference = 0;
    int geometric = 0;
    int length= arr.length-1;
    for(int i = 0, j = 1, k = 2; k<length; i++, j++, k++){
      int first = arr[i];
      int second = arr[j];
      int third = arr[k];
      difference = second-first;
      if(third-second != difference){
          return false;
      }
    }
    return true;
  }
    
  private boolean geo(int[] arr){
    int length = arr.length-1;
    for(int i=0, j=1,k=2; k<length; i++, j++, k++){
      int first = arr[i];
      int second = arr[j];
      int third = arr[k];
      int div = second/first;
      if(third/second != div){
        return false;
      }
    }
    return true; 
  }

  public static void main (String[] args) {  
  // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.ArithGeo(s.nextLine())); 
  }   
  
}           