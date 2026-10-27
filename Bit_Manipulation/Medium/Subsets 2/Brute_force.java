class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> curr, int[] nums, int start) {
        result.add(new ArrayList<>(curr));

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i-1]) continue;
            curr.add(nums[i]);
            backtrack(result, curr, nums, i + 1);
            curr.remove(curr.size() - 1);
        }
    }
}
// tc: O(n*2^n) sc: O(n)