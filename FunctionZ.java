import java.util.*; 
import java.io.*;

class FunctionZ {  
  int SecondGreatLow(int[] arr) { 
  Arrays.sort(arr);
  int lowest = arr[0];
  int highest = arr[arr.length-1];
  int secondLowest = 0;
  int secondHighest = 0;
    if(arr.length==2){
    	secondLowest= highest;
    	secondHighest= lowest;
      return secondLowest + " " + secondHighest;
    }
    
    for(int i = 0; i<arr.length; i++){
      if(arr[i]>lowest && arr[i] != highest){
      arr[i] = secondHighest;
      }
    }
    
    for(int i = arr.length-1; i>0; i--){
      if(arr[i]<highest && arr[i] != lowest){
      arr[i] = secondLowest;
      }
    }
    
    return secondLowest + " " + secondHighest;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.SecondGreatLow(s.nextLine())); 
  }   
  
}
