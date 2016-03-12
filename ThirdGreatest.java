import java.util.Arrays;

public class ThirdGreatest{
	static void removeGreatest(String[] strArr){
  		int maxLen = 0;
  		int index = 0;
    	for(int i =0; i<strArr.length; i++){
      		if(strArr[i].length() > maxLen){
      			maxLen = strArr[i].length();
        		index = i;
      		}
    	}
    	strArr[index] = "";
	}
	static String ThirdGreatest(String[] strArr) { 
   		removeGreatest(strArr);
    	removeGreatest(strArr);
    	int max = 0;
    	int indexOf = 0;
    	for(int i = 0; i< strArr.length; i++){
      		if(strArr[i].length() >= max){
      			max = strArr[i].length();
      			indexOf = i;
      		}
   		}  
    	return strArr[indexOf];
    } 
	public static void main(String[] args){
		String[] str = {"coder","byte","code"};
		String the = ThirdGreatest(str);
		System.out.println(the);
	}
}