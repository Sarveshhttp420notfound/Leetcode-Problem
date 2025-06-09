class Solution {
    public int countPrimes(int n) {
        if(n<2)
          return 0;
        boolean[] b=new boolean[n];
        Arrays.fill(b,true);
        b[0]=b[1]=false;
        for(int i=2;i*i<n;i++){
            if(b[i]){
                for(int j=i*i;j<n;j+=i)
                   b[j]=false;
            }
        }  
        int count=0;
        for(boolean x:b){
            if(x)
              count++;
        }
        return count;
        
    }
}