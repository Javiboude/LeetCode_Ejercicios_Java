package Palindrome_Number;

class Solution {
	public boolean isPalindrome(int x) {

		int original = x;
		int reversa = 0;

		while (x < 0) {
			return false;
		}

		while (x != 0) {
			int numFinal = x % 10;
			reversa = reversa * 10 + numFinal;
			x = x / 10;
		}

		if (original == reversa) {
			return true;
		} else {
			return false;
		}
	}
}