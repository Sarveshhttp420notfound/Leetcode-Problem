class Solution {
    public int alternateDigitSum(int n) {
        int count=getCount(n);
    
        int sum=0;
        while(n>0){
            int rem=n%10;
            if(count%2==1){
                sum=sum+rem;

            }
            else{
                sum=sum-rem;
            }
            n/=10;
            count--;
        }
        return sum;    
    }
    public int getCount(int n){
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }
}