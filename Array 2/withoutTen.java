public int[] withoutTen(int[] nums) {
  int idx = 0;
  int[] ans = new int [nums.length];
  for (int i=0; i<nums.length; i++) {
    if (nums[i] != 10) ans[idx++] = nums[i];
  }
  return ans;
}
