import java.util.*; 
import java.io.*;
public class FunctionZA {
public static void main(String[] args){  
  int[] arr= {1,43,42,140} ;
  Arrays.sort(arr);
  int lowest = arr[0];
  int highest = arr[arr.length-1];
  int secondLowest=0;
  int secondHighest=0;
   /* if(arr.length==2){
    	secondLowest= highest;
    	secondHighest= lowest;
      return secondLowest;
    }
    
    for(int i = 0; i<arr.length; i++){
      if(arr[i]>lowest && arr[i] != highest){
      arr[i] = secondHighest;
      }
    }
   */
    for(int i = arr.length-1; i>0; i--){
      if((arr[i]<=highest) && (arr[i] != lowest)){
      secondLowest=arr[i];
      }
    }
    
    System.out.println(secondLowest);
  }
} 