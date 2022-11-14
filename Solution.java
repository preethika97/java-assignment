
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = s.nextInt();
			}
		}
		int diff;
		int c = 0, d = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; i++) {
				if (i == j)
					c += a[i][j];
				if ((i + j) == (n - 1))
					d += a[i][j];
			}
		}
		diff = c - d;
		System.out.println(Math.abs(diff));
	}
}
