class Solution {
    public int search(int[] nums, int target) {
        int index = Arrays.binarySearch(nums,target);
        if(index >= 0){
            return index;
        }
        return -1;
    }
}

// for interview and more dont use Array.binarySeach liberary make yourself the code using left,right,mid,pointers