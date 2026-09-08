class Solution {
    public int countCommas(int n) {
        int count =  String.valueOf(n).length(); 
        int result = 0;
        if(count >= 4){
             int nor  = (int) Math.pow(10, 4 - 1);
              result = (n - nor) + 1;
        }
        return result;
    }
}