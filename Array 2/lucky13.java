public boolean lucky13(int[] nums) {
  boolean flag = true;
  for (int i=0; i<nums.length; i++) {
    flag &= (nums[i] != 1 && nums[i] != 3);
  }
  return flag;
}
