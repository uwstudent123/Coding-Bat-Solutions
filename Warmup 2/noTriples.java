public boolean noTriples(int[] nums) {
  boolean flag = true;
  for (int i=0; i<nums.length - 2; i++) {
    if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2] && nums[i] == nums[i + 2]) flag = false;
  }
  return flag;
}
