public boolean twoTwo(int[] nums) {
  boolean flag = true, temp = true;
  for (int i : nums) {
    temp &= i != 2;
  }
  for (int i=0; i<nums.length; i++) {
    if (nums[i] == 2) {
      if ((i > 0 && nums[i - 1] == 2) || (i < nums.length - 1 && nums[i + 1] == 2)) continue;
      else flag = false;
    }
  }
  return flag;
}
