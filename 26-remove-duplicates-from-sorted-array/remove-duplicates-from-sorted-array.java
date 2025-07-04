class Solution {
    public int removeDuplicates(int[] nums) { //0,0,1,1,1,2,2,3,3,4
         if (nums.length == 0) return 0;
         int n=nums.length;
         int i=0,j=1;

         while(j<n){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
            j++;
         }
         return i+1;
       
        
    }
}