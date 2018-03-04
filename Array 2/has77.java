public boolean has77(int[] nums) {
  boolean flag = false;
  for (int i=0; i<nums.length - 1; i++) {
    if (nums[i] == 7 && nums[i + 1] == 7) flag = true;
  }
  for (int i=0; i<nums.length - 2; i++) {
     if (nums[i] == 7 && nums[i + 2] == 7) flag = true;
  }
  return flag;
}
