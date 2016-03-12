public class LongestWord2{
	public static void main(String[] args){
		String sen = "fun&!! time";
		 String modified = sen.replaceAll("[^a-zA-Z\\s]","");
  String[] arr = modified.split(" ");
  int lengthOf = 0;
  String longest="";
    for(int i =0;i<arr.length;i++){
    	String word = arr[i];
     	 if(word.length()>lengthOf){
      		lengthOf = word.length();
      		longest=word;
      	}
    }
		System.out.println(longest);
	}
}