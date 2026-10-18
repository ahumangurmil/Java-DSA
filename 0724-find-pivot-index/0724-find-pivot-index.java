class Solution {
    public int pivotIndex(int[] nums) {
        
        for (int pivotIndex = 0;pivotIndex < nums.length; pivotIndex++) {
            int leftSum = 0;
        int rightSum = 0;
            for (int j = pivotIndex + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }
            for (int i = pivotIndex - 1;i>=0 ; i--) {
                leftSum += nums[i];
            }
        
        if (rightSum == leftSum) {
            return pivotIndex;
        } 
        }
        return -1;
    }

}