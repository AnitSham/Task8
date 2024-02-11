package task;

import java.util.Scanner;

public class Integer {

	public static void main(String[] args) {
		
		int a,b,c,d,x,y,num;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value:");	
		a=sc.nextInt();
		System.out.println("Enter the b value:");
		b=sc.nextInt();
		System.out.println("Enter the c value:");	
		c=sc.nextInt();
		System.out.println("Enter the d value:");	
		d=sc.nextInt();	
		x=a+b;
		y=c+d;
		System.out.println("The value of x is:"  +x);
		System.out.println("The value of y is:" +y);
		if(x>y) {
			System.out.println("Sum of a and b is greater than sum of c and d  or x is greater that y");
		}else {
			System.out.println("Sum of c and d is greater than sum of a and b  or y is greater that x");
		}
		
		
		
		
	}

}
