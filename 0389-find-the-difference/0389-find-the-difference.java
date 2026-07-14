class Solution {
    public char findTheDifference(String s, String t) {
        int a = 0;
        int b = 0;
        for(int i = 0;i <= s.length() - 1;i++){
            a += s.charAt(i);
        }
        for(int j = 0;j <=t.length() - 1;j++){
            b += t.charAt(j);
        }

        return (char)(b-a);
        
    }
}