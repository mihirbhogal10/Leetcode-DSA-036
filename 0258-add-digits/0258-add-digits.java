class Solution {
    public int addDigits(int num) {
        int x=(num!=0)?1+(num-1)%9: 0;
        return x;
    }
}