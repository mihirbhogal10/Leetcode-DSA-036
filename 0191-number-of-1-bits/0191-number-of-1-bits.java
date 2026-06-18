class Solution {
    public int hammingWeight(int n) {
        int i=0;
        while(n!=0){
            if(n%2==1){
                i++;
            }
            n=n/2;
        }
        return i;
    }
}