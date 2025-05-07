class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;

        int bit1 = 0;
        while (n > 0) {
            if ((n % 2) == 1) bit1++;
            n /= 2;
        }

        return bit1 == 1;
    }
}
