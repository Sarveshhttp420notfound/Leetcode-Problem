class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] b=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            b[i]=nums[i];
            b[nums.length+i]=nums[i];
        }
        return b;
        
    }
}