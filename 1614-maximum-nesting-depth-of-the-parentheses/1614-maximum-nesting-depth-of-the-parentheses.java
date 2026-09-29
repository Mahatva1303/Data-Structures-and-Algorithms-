class Solution {
    public int maxDepth(String s) {
        int res = 0;
        int curr = 0;
            for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                curr++;
                res = Math.max(res, curr);
            } 
            else if (s.charAt(i) == ')') {
                curr--;
            }
        }
        return res;
    }
}

// Time = O(N)
//Space = O(1)