class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int end = 0;
        for(int i = 0; i < nums.length; i++) {
            end += nums[i];
            if(max < end) {
                max = end;
            }
            if(end < 0) {
                end = 0;
            }
        }
        return max;
    }
}