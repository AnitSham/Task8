package task;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		int num;
		int count=0;
		
		Scanner sc = new Scanner (System.in);
	    System.out.println("Enter the value of a");
		num=sc.nextInt();
		
		for(int i=1; i<=num; i++)
			
		if(num%i==0) {
			count++;
		}
	
	if(count==2) {
			System.out.println(num+ "  is a prime number");
		}else {
			System.out.println(num+ "  is not a prime number");
		}
}
}
