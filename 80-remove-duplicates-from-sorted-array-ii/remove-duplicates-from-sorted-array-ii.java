class Solution {
    public int removeDuplicates(int[] nums) {
        int index=0;
        nums[index++]=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[index++]=nums[i];
                count=1;
            }
            else if(nums[i]==nums[i-1]&&count<2){
                 nums[index++]=nums[i];
                count++;
            }
            else{
                count++;
                }
    }
    return index;
}
}