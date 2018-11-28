package com.techlab.calculator;

public class MaxChar {
	public static void main(String[] args) {
		//char result = maximumRepeating("helloworld");
		//System.out.println("repeating character is " + result);
		
		asciiSize("nikita");
		asciiAtoZ();
	}

	/*public static char maximumRepeating(String inputString) {
		char result = 0;
		for (int i = 0; i < inputString.length(); i++) {
			int count = 0;
			for (int j = i + 1; j < inputString.length(); j++) {
				if (inputString.charAt(i) == inputString.charAt(j))
					result = inputString.charAt(i);
			}
			count++;
		}

		return result;
	}*/
	
	public static int asciiSize(String input){
		char[] words=input.toCharArray();
		int num=0;
		for(int i=0;i<input.length();i++){
			 num=(int)words[i];
		System.out.println("Ascii value of "+input.charAt(i)+" "+num);
		}
		return num;
		
	}
	 public static void asciiAtoZ(){
		 
		 for(int i=0;i<=256;i++){
			 System.out.println(i+"--- "+(char)i);
			 
		 }
		
		 
	 }

}
