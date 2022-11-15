import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 digit Number : ");
		int number = sc.nextInt();
		int temp = number;
		int digit1, digit2, digit3;

		digit3 = temp % 10;
		temp = temp / 10;

		digit2 = temp % 10;
		temp = temp / 10;

		digit1 = temp % 10;
		int result = (digit1 * digit1 * digit1) + (digit2 * digit2 * digit2) + (digit3 * digit3 * digit3);

		if (number == result) {
			System.out.println(number + " is armstrong number ");
		} else {
			System.out.println(number + " is not armstrong number ");
		}
	}
}
