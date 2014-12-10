class FastSummation {
	public static void main(String[] args) {
		for (int i = -1; i < 100; i++) {
			System.out.println("FastSummation("+ i + ") = "+ fastSummation(i));
		}
	}

	// Sums up from 1 to integer n in log time
	private static int fastSummation(int n) {
		if (n < 0) throw new IllegalArgumentException("Negative integer input: "+ n);
		// initial condition
		if (n < 2) return n;
		// if n is odd, return fastSummation(n-1) + n;
		if (n % 2 == 1) return fastSummation(n-1) + n;
		// if n is even, do the magic :)
		return 2*fastSummation(n/2) + (n/2)*(n/2);
	}
}
