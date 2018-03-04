public int sum67(int[] nums) {
  int sum = 0;
  boolean flag = false;
  for (int i=0; i<nums.length; i++) {
    if (nums[i] == 6) {
      flag = true;
      continue;
    }
    if (nums[i] == 7) {
      if (flag) {
        flag = false;
        continue;
      }
    }
    if (!flag) sum += nums[i];
  }
  return sum;
}
