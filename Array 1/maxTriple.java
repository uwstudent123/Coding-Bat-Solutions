public int maxTriple(int[] nums) {
  if (nums.length == 1) return nums[0];
  int start = nums[0];
  int end = nums[nums.length - 1];
  int mid = nums[nums.length >> 1];
  int ans = Math.max(start, Math.max(mid, end));
  return ans;
}
