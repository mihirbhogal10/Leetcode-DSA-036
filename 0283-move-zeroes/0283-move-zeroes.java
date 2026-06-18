class Solution {
    public void moveZeroes(int[] nums) {
        int temp,i=0,j=1;
        while(j<nums.length){
            if(nums[i]!=0)i++;
            else if(nums[i]==0 && nums[j]!=0){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;  
                i++; 
            }
            j++;
        }
    }
}