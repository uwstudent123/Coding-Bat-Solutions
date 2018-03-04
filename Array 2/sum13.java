public int sum13(int[] nums) {
  int sum = 0;
  boolean flag = false;
  if (nums.length == 0) return 0;
  for (int i=0; i<nums.length; i++) {
    if (nums[i] == 13 || (i > 0 && nums[i - 1] == 13)) continue;
    sum += nums[i];
  }
  return sum;
}