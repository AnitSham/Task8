package task;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		
		int a;
		
		Scanner sc = new Scanner (System.in);
	    System.out.println("Enter the value of a");
		a=sc.nextInt();
		
		if(a%2==0) {
			System.out.println("a is a even number");
		}else {
			System.out.println("a is not a even number");
		}
}
}