import java.util.*;
import java.io.*;

public class SimpleSymbols1{
	public static Boolean SimpleSymbols(String str){
		char[] strToCh= str.toCharArray();
		for(int i=1, j=2;j<strToCh.length;i++, j++){
			if(Character.isLetter(strToCh[i]) && 
			  (strToCh[i-1]!='+' || strToCh[j] !='+') ){
				return false;
			}

		}
		return true;
	}

	public static void main(String args[]){
		String str = "+=+2+====+++2+2=";
		System.out.println(SimpleSymbols(str));

	}	
}