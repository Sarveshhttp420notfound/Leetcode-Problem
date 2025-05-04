class Solution {
    public boolean hasAlternatingBits(int n) {
        int last=n%2;
        n/=2;
        while(n!=0){
            int next=n%2;
            if(next==last){
                return false;
            }
            last=next;
            n/=2;
        }
        return true;
        
    }
}