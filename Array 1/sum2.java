public int sum2(int[] nums) {
  if (nums.length == 0) return 0;
  int sum = 0;
  if (nums.length < 2) for (int i=0; i<nums.length; i++) sum += nums[i];
  else sum = nums[0] + nums[1];
  return sum;
}
