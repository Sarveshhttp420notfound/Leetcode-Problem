class Solution {
    public boolean isPowerOfThree(int n) {
         if (n <= 0) return false;

        int bit1 = 0;
        while (n > 0) {
            if ((n % 3) == 1) bit1++;
            else if((n%3)!=0) return false;
            n /= 3;
        }

        return bit1 == 1;
        
    }
}