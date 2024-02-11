package task;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		
		int count=0;
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num=sc.nextInt();
		
	while(num!=0) {
		num=num/10;
		count++;
	}
	System.out.println("The number of didgits for these number is: " +count);
	}

}
