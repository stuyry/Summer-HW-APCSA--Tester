public class Tester {
	public static boolean isPrime(int x) {
		if (x < 2) return false;
		for (int i = 2; i <= (int) Math.sqrt(x); i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int nthPrime(int n) {
		int c = 0;
		for (int i = 2; ; i++) {
			if (isPrime(i)) c++;
			if (c == n) return i;	
		}
	}
}
