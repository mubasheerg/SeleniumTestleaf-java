package week1.day2;

public class LearnBreak {
	public static void main(String[] args) {
		{
			int j = 10;

			System.out.print("the odd numbers from 1 to 10 is ");
			for (int i = 1; i <= j; i++) {
				if (i % 2 == 1) {
					System.out.print(i + " ");
				}
			}
		}
	}
}