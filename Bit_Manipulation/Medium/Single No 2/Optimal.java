
class Solution {
    public int singleNumber(int[] nums) {
        int singleNumber = 0;

        for (int bit = 0; bit < 32; bit++) {
            int bits = 0;

            for (int c : nums) {
                bits += (c >> bit) & 1;
            }

            singleNumber += ((bits % 3) << bit);
        }

        return singleNumber;
    }
}
// tc: O(n) sc: O(1)