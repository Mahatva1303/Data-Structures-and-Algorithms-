class Solution {
    public int missingMultiple(int[] nums, int k) {
        int m = nums.length;
        int n = 1;
        for(int i = 1;i < 1000;i++){
             n = k*i;
            int count = 0;
             for(int j = 0;j < m;j++){
            if(n != nums[j]){
               count++;
            }
            if(count == m){
                return n;
            }
         }
        }
        return 0;
    }
}

// time complexity O(n)
// Space complexity O(1)