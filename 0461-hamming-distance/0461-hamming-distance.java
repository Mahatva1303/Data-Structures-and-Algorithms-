class Solution {
    public int hammingDistance(int x, int y) {
        String bits1 = Integer.toBinaryString(x);
        String bits2 = Integer.toBinaryString(y);

        // Find the maximum length
        int maxLength = Math.max(bits1.length(), bits2.length());

        // Pad both strings with leading zeros
        String paddedBits1 = String.format("%" + maxLength + "s", bits1).replace(' ', '0');
        String paddedBits2 = String.format("%" + maxLength + "s", bits2).replace(' ', '0');

        int result = 0;

        // Compare each bit
        for (int i = 0; i < maxLength; i++) {
            if (paddedBits1.charAt(i) != paddedBits2.charAt(i)) {
                result++;
            }
        }

        return result;
    }
}