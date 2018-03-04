public int[] tenRun(int[] nums) {
  int res = -1;
  for (int i=0; i<nums.length; i++) {
    if (nums[i] % 10 != 0 && res != -1) nums[i] = res;
    else if (nums[i] % 10 == 0) res = nums[i];
  }
  return nums;
}
