package task;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		int a,b,third=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Before Swap");
		System.out.println("Enter the value of a: ");
		a=sc.nextInt();
		System.out.println("Enter the value of b: ");
		b=sc.nextInt();
		
		third=a;
		a=b;
		b=third;
		
		System.out.println("After swap");
		System.out.println("The value of a:" +a);
		System.out.println("The value of b: " +b);
		
		
	}

}
