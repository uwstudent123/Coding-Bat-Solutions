public int bigDiff(int[] nums) {
  int minn = Integer.MAX_VALUE, maxx = 0;
  for (int i=0; i<nums.length; i++) {
    minn = Math.min(minn, nums[i]);
    maxx = Math.max(maxx, nums[i]);
  }
  return maxx - minn;
}
