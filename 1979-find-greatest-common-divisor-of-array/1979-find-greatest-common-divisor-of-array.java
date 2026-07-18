class Solution {
    public int findGCD(int[] nums) {
        int smallest = nums[0];
        int greatest = nums[0];
        for(int i = 1;i < nums.length;i++){
            if(nums[i] < smallest){ // smallest number calculation in array
                smallest = nums[i];
            }

            if(nums[i] > greatest){ //greatest number calculaion in array
                greatest = nums[i];
            }
        }
// if you take while loop inside for loop it will not aloww to check full array 
            while(greatest != 0){ // GCD calculation
                int temp = greatest;
                greatest = smallest % greatest;
                smallest = temp;
            }

        
        return smallest;
        
    }
}