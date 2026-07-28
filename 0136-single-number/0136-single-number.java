class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num:nums){
            result ^= num;
        }
        return result;
    }
}

// XOR logic can also use Hashmap but it will increse its time complexity
// time complexity O(N)
//SPACE COMPLEXITY O(1)