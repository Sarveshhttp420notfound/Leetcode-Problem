class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1)
              return true;
        else if(n%2==1)
              return false;

        int bit1=0;
        while(n>0){
            if(n%4>1)
                return false;
            if(n%4==1)bit1++;
        n/=4;    
        }
        return bit1==1;        
    }
}