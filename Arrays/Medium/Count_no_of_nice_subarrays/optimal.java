class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int left = 0;
        int oddCount = 0;
        int evenBefore = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % 2 != 0) {
                oddCount++;
                evenBefore = 0;
            }
            while (oddCount > k) {

                if (nums[left] % 2 != 0) {
                    oddCount--;
                }

                left++;
            }
            if (oddCount == k) {
                while (nums[left] % 2 == 0) {
                    evenBefore++;
                    left++;
                }
                count += evenBefore + 1;
            }
        }

        return count;
    }
}// tc -> O(n) sc -> O(1)
