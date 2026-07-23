class Solution {
    public String licenseKeyFormatting(String s, int k) {
          String modified = s.replace("-", "").toUpperCase();
        int count = modified.length();

        StringBuilder ans = new StringBuilder();

        int first = count % k;
        int i = 0;

        if (first != 0) {
            ans.append(modified.substring(0, first));
            i = first;
        }

        while (i < count) {
            if (ans.length() > 0)
                ans.append("-");
            ans.append(modified.substring(i, i + k));
            i += k;
        }
        return ans.toString();

    }
}

// review agin this question