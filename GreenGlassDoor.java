class GreenGlassDoor{
	public static void main (String[] args){
		String str = "gozbye";
		char[] chars = str.toCharArray();
		boolean answer = false;
		for(int i = 1; i<str.length(); ++i){
			if(chars[i]==chars[i-1]){
				answer = true;
			}
		}

		System.out.println(answer);
	}

}