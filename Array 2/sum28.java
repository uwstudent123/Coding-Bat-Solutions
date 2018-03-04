public boolean sum28(int[] nums) {
  int sum = 0;
  boolean flag = false;
  for (int i : nums) {
    if (i == 2) {
      sum += i;
    }
  }
  return flag = sum == 8;
}
