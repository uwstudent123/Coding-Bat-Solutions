public boolean tripleUp(int[] nums) {
  boolean flag = false;
  for (int i=0; i<nums.length - 2; i++) {
    if (nums[i] + 1 == nums[i + 1] && nums[i + 1] + 1 == nums[i + 2]) flag = true;
  }
  return flag;
}
