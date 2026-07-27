class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int totallength = nums.length;
        int maxElement1 = nums[totallength - 1];
        int maxElement2 = nums[totallength - 2];

        int product = (maxElement1-1) * (maxElement2-1);
        return product;
    
    }
}