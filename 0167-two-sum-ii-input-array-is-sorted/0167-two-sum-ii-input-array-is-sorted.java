class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1;
        int []arr = new int [2];
        while(i!=j){
            if(numbers[i]+numbers[j]==target){
                arr = new int[]{i+1, j+1};
                return arr;
            }
            else if(numbers[i]+numbers[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        arr = new int[]{0,0};
        return arr;
    }
}