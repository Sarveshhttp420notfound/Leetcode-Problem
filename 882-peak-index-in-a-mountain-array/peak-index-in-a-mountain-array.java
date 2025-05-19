class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0, heigh=arr.length-1;
        while(low<heigh){
            int mid=low+(heigh-low)/2;

            if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }
            else{
                heigh=mid;
            }
        }
        return low;
    }
}