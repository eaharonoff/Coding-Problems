import java.util.*;
import java.io.*;
class FunctionQ{
	String LetterCountI(String str) { 
  
    String[] words = str.split(" ");
    int maxCount = 1; 
    String maxWord = "";
    for (String word: words){
      	int repeat = 1; 
    	char[] letters = word.toCharArray();
    	Arrays.sort(letters);
      	for(int i = 1; i<word.length();i++){
        	if(letters[i]==letters[i-1]){
        		repeat++;
        	}
      	}
       	
        if(repeat > maxCount){
        	maxCount = repeat;
        	maxWord = word;
        }
    	
      
    }
               if(maxWord==""){
               return "-1";
               }
               else{
               return maxWord;
               }
    
  } 


	public static void main (String[] args){
	
	}
}