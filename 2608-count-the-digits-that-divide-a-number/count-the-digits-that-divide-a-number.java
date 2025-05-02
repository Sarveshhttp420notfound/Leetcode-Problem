class Solution {
    public int countDigits(int n) {
       // int val=0;
       int original = n;
        int c=0;
        while(n!=0){
           int val=n%10;         //val=2
           if(val != 0 &&original%val==0){      //12%2
              c++;            //1
           }
           n=n/10;                       //12
        }
        return c;
    }
}