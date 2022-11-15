
public class Methods {
	// no return no argument
	public void add() {
		int a = 8;
		int b = 3;
		System.out.println("Addition : " + (a + b));
	}

	// no return with argument
	public void sub(int a, int b) {
		System.out.println("Subtraction : " + (a - b));
	}

	// returm without args
	public int mul() {
		int a = 2;
		int b = 3;
		return a * b;
	}

	// returm with args
	public int div(int a, int b) {
		return (a / b);
	}

	public static void main(String[] args) {
		Methods o = new Methods();
		o.add();
		o.sub(8, 3);
		System.out.println("Multiplication : " + o.mul());
		System.out.println("Division : " + o.div(8, 3));
	}
}
