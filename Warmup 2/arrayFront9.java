public boolean arrayFront9(int[] nums) {
  if (nums.length == 0) return false;
  boolean flag = false;
  for (int i=0; i<nums.length; i++) {
    if (i <= 3) {
      if (nums[i] == 9) flag = true;
    }
  }
  return flag;
}
