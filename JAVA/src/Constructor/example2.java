package Constructor;

public class example2 {

	int a;// declaration
	int b;
	int c;

	example2() {
		a = 30;// initialization
		b = 20;
	}

	example2(int x, int y) {
		a = x;
		c = y;
	}

	example2(int x, int y, int z) {
		a = x;
		b = y;
		c = z;
	}

	public void addition() {
		System.out.println(a + b + c);
	}
}
