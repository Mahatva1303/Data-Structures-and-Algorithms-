class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0){
            return false;
        }
        for(int x = 0;x < 31;x++){
            int value = (int)Math.pow(2,x);
            if(value == n){
                return true;
            }
        }
        return false;
    }
}