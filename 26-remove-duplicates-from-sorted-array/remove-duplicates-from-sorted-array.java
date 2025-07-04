class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;

        int i = 0; // pointer for the last unique element

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j]; // move unique element forward
            }
        }

        return i + 1; // number of unique elements
    }
}
