package week1.day2;

import java.util.Scanner;

public class LearnIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int price = in.nextInt();

		if (price < 500) {
			System.out.println("The delivery charge will be 100");
		} else {
			System.out.println("The delivery is free of cost");
		}

	}

}
