class Solution {
    public boolean checkDivisibility(int n) {
        int original = n;
        int sum = 0;
        int multiply = 1;
        while(n > 0){
            int one = n%10;
            sum += one;
            multiply *= one;
           n = n/10; 
        }
        int TotalValue = sum + multiply;
        if(original % TotalValue == 0){
            return true;
        }
        return false;
    }
}