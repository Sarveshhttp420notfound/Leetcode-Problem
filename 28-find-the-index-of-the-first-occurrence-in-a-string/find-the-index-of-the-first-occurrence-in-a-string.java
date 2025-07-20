class Solution {
    public int strStr(String h, String n) {
        int a=h.length();
        int b=n.length();
        for(int i=0;i<=a-b;i++){
            for(int j=0;j<b;j++){
                if(h.charAt(i+j) !=n.charAt(j)){
                    break;
                }
                if(j==b-1){
                    return i;
                }
            }
        }
        return -1;
        
    }
}