class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

		int original = x; // Save old value
		long reversed = 0; // Use long to prevent overflow during calculation

		while (x > 0) {
			reversed = (reversed * 10) + (x % 10);
			x /= 10;
		}

		return reversed == original;
	}
}