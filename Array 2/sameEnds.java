public boolean sameEnds(int[] nums, int len) {
  boolean flag = true;
  for (int i=0; i<len; i++) if (nums[i] != nums[nums.length - len + i]) flag = false;
  return flag;
}
