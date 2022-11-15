import java.util.*;

public class ReverseString {

	public static void main(String[] args) {

		StringBuilder a = new StringBuilder("Reverse a String");
		System.out.println(a);
		// Reverse a String
		StringBuilder b = new StringBuilder();
		for (int i = a.length() - 1; i >= 0; i--) {
			b.append(a.charAt(i));
		}
		System.out.println(b);
	}

}
