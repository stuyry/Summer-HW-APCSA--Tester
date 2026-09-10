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

	public static void main(String[] args) {
		int[] testCases = {1, 2, 5, 6, 8, 10, 13, 15, 20, 30};
		int[] expectedResults = {2, 3, 11, 12, 19, 29, 41, 47, 71, 113};

		for (int i = 0; i < testCases.length; i++) {
			int result = nthPrime(testCases[i]);
			if (result == expectedResults[i]) {
				System.out.println("Test case " + testCases[i] + " passed.");
			} else{
				System.out.println("fail. Input: " + testCases[i] + ". Expected " + expectedResults[i] + ", but value returned was " + result);
			}
		}
	}
}
