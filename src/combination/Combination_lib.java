package combination;

public class Combination_lib {
	private int n;

	public Combination_lib(int n) {// n‚ÌŠKæ
		this.n = n;

	}

	public int getFactorial(int n) {
		int a;

		a = 1;

		for (int i = n; i > 0; i--)
			a *= i;

		return a ;
	}

}
