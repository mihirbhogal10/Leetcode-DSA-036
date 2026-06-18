class Solution {
    public boolean isPalindrome(int x) {
        int y=0,z=x;
        while(z>0){
            y=y*10+z%10;
            z=z/10;
        }
        if(y==x) return true;
        else return false;
    }
}