public boolean either24(int[] nums) {
  boolean flag = false;
  for (int i=0; i<nums.length - 1; i++) {
    if (((nums[i] == 2 && nums[i + 1] == 2) && !(nums[i] == 4 && nums[i + 1] == 4)) || (!(nums[i] == 2 && nums[i + 1] == 2) && (nums[i] == 4 && nums[i + 1] == 4))) flag = true;
  }
  boolean temp1 = false, temp2 = false;
  for (int i=0; i<nums.length - 1; i++) {
    if (nums[i] == 2 && nums[i + 1] == 2) temp1 = true;
    if (nums[i] == 4 && nums[i + 1] == 4) temp2 = true;
  }
  if (temp1 && temp2) flag = false;
  return flag;
}
