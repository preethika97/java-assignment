import java.util.*;

public class SumAndAverage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit : ");
		int n = sc.nextInt();
		int sum = 0, a;
		for (int i = 0; i <= n; i++) {
			System.out.println("Enter the Numbers " + i + " : ");
			a = sc.nextInt();
			sum += a;
		}
		System.out.println("The sum of given number is : " + sum);
		System.out.println("The avg of given number is : " + sum / n);
	}
}
