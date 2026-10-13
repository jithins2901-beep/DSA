class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int ans = 0;
        for (int i = 1; i < n - 1; i++) {
            int left = 0, right = 0;
            for (int j = i; j >= 0; j--) {
                left = Math.max(left, height[j]);
            }
            for (int j = i; j < n; j++) {
                right = Math.max(right, height[j]);
            }
            ans += Math.min(left, right) - height[i];
        }
        return ans;
    }
}// tc -> O(n^2) sc -> O(1)