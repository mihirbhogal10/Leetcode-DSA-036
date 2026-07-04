class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0, k=0;
        for (int i=0; i<nums.length; i++){
            if(nums[i]==1){
                ++k;
                if (sum < k){
                    sum = k;
                }
            }
            else k=0;
        }
        return sum;
    }
}