public boolean only14(int[] nums) {
  boolean flag = true;
  for (int i : nums) {
    flag &= (i == 1 || i == 4);
  }
  return flag;
}
