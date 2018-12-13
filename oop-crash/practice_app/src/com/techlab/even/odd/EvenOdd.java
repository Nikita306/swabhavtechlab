package com.techlab.even.odd;

public class EvenOdd {
	public static void main(String[] args) {
		int number=0;
		for(int i=1;i<100;i++){
			if(i%2==0){
				number=i*2;
			}else{
				number=i;
			}
			System.out.print(number+" ");
		}
	
}

}
