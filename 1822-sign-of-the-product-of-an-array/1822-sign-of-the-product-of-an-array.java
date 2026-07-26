class Solution {
    public int arraySign(int[] nums) {
        double result = 1;
        for(int i =0;i < nums.length;i++){
            result *= nums[i];
        }
        if(Math.signum(result) > 0){
            result = 1;
        }
        else if(Math.signum(result) < 0){
            result = -1;
        }
        else{
            result = 0;
    }
        return (int) result;
        
    }
}

// time - O(n)
// space - O(1)
// find different solution for checking only sign