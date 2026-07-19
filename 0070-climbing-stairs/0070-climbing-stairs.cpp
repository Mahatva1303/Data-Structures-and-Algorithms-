class Solution {
public:
    int climbStairs(int n) {
        int totalstrais = 0;
        if(n <=3){ // edge test cases
            return n;
        }
        int a = 3,b = 2;
       for(int i = 0;i < n-3;i++ ){ // fibonacii series to solve 
         a = a+b;
         b=a-b;
       }
       return a;
    }
};