class Solution {
    public boolean isPalindrome(int x) {
        int r, sum = 0;
        int n = x; // Initialize n with the value of x

        if (x < 0) {
            return false;
        } else {
            while (n > 0) {
                r = n % 10;
                sum = (sum * 10) + r;
                n = n / 10;
            }

            return sum == x;
        }

    }
}
