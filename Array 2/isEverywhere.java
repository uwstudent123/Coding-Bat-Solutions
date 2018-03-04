public boolean isEverywhere(int[] nums, int val) {
  boolean flag = true;
  for (int i=0; i<nums.length; i++) {
    if (i + 1 <= nums.length - 1) flag &= (nums[i] == val || nums[i + 1] == val);
  }
  return flag;
}
