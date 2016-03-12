import java.util.*;
public class OffLineMinimum{
	
	public static int smallestIndex(ArrayList<Integer> nums){
		int min = Integer.MAX_VALUE;
    	int smallestIndex = 0;
    	for(int i = 0; i<nums.size();i++){
      		int theNum = nums.get(i);
      		if(theNum<min){
      			min = theNum;
        		smallestIndex = i; 
      		}
   		}
    	return smallestIndex; 
  	}

	public static void main(String[] args){
		 String[] strArr ={"5","4","6","E","4","1","11","E","E"};
		 ArrayList<Integer> numbersList = new ArrayList<Integer>();
  		 int leastIndex = 0;
 		 String output = "";
    	for(int i = 0; i<strArr.length; i++){
      		String number = strArr[i];
     	    if(!number.equals("E")){
      			numbersList.add(Integer.parseInt(number));
      		}
      		else if(number.equals("E") && i!=0){
      			leastIndex = smallestIndex(numbersList);
      			output+=",";
        		output+=numbersList.get(leastIndex);
        		numbersList.remove(leastIndex);
      		}
    	}
		System.out.println(output.substring(1));
	}
}