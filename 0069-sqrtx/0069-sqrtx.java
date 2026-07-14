class Solution {
    public int mySqrt(int x) {
        double sqrtpp = Math.sqrt(x);
        int roundit = (int) Math.floor(sqrtpp);
        return roundit;
        
    }
}