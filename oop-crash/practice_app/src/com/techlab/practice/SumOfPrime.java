package com.techlab.practice;

public class SumOfPrime {
	/*public static boolean isPrime(int num) {
		for (int i = 2; i <=num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 2; i<=13; i++) {
			if (isPrime(i)) {
				System.out.print(i+"+");
				sum = sum + i;
			
			} 

		}
		System.out.println(" sum="+sum);
	}*/
	
	public static void main(String[] args) {
	int n=100,k=0;
	int flag=0;
	int[] a=new int[25];
	System.out.println(" HI");
		
		for(int i = 2; i <= n; i++)
        {
            for( int j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    flag = 0;
                    break;
                }
                else
                {
                    flag = 1;
                }
            }
            if(flag == 1)
            {
               
                a[k]=i;
                //System.out.println(a[k]);
                k++;
            }
        }
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);	
		}
		for(int i = 0; i <a.length ; i++)
		{
			int sum=2;
			for(int j = 0; j < a.length-1-i; j++)
			{
				sum=sum+a[j];
			}
			//System.out.println(sum);
			if(sum==a[a.length-1-i])
			{
			System.out.println(sum);
			
			}
			
		}
		/*for(int i = a.length-1; i >=0 ; i--)
		{
			int sum=2;
			for(int j = 0; j < i; j++)
			{
				sum=sum+a[j];
			}
			//System.out.println(sum);
			if(sum==a[i])
			{
			System.out.println(a[i]);
			}
			
		}*/
	
	}
	

}
