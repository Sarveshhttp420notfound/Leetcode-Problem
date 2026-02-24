class Solution {
    public boolean isPalindrome(String str) {
         str=str.toLowerCase().replaceAll("[^a-z0-9]","");
        int i=0;
        int j=str.length()-1;
        while(i<j){
            char ch1=str.charAt(i);
            char ch2=str.charAt(j);
            if(ch1!=ch2){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
        
    }
}