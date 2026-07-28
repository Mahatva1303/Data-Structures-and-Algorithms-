class Solution {
    public int subtractProductAndSum(int n) {
        int first = 0;
        int total = 0;
        int sum = 0;
        int multiplication = 1;
        while(n > 0){
            first = n % 10;
            n = n / 10;
            sum += first;
            multiplication *= first;
        }
        total = multiplication - sum;
        return total;

    }
}