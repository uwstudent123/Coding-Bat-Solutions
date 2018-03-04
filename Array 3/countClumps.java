public int countClumps(int[] nums) {
  int ans = 0, len = 0;
  int idx = 0;
  while (idx < nums.length) {
    int res = nums[idx];
    idx++;
    len = 0;
    while (idx < nums.length && nums[idx] == res) {
      idx++;
      len++;
    }
    if (len > 0) ans++;
  }
  return ans;
}
