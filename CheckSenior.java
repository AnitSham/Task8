package task;

import java.util.Scanner;

public class CheckSenior {

	public static void main(String[] args) {
		
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age :");
		age=sc.nextInt();
		
		if(age>60) {
			System.out.println("The Person is Senior Citizen");
		}else {
			System.out.println("The Person is Still Adult");
		}
	}

}
