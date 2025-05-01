class Solution {
    public int subtractProductAndSum(int n) {
        int i=1;
        int s=0;
        int p=1;
        int r=0;
        while(n!=0){
            int a=n%10;
            s=s+a;
            p=p*a;
            n=n/10;
        }
       int q= p-s;
       return q;
        
        
    }
}