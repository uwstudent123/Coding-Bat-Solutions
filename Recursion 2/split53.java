public boolean splitArray (int start, int[] nums, int target) {
  if (start >= nums.length) return target == 0;
  if (nums[start] % 5 == 0) return splitArray(start + 1, nums, target - nums[start]);
  else if (nums[start] % 3 == 0) return splitArray(start + 1, nums, target);
  return (splitArray(start + 1, nums, target - nums[start]) || splitArray(start + 1, nums, target));
}

public boolean split53(int[] nums) {
  int sum = 0;
  for (int i : nums) sum += i;
  return (sum % 2 == 0 && splitArray(0, nums, sum / 2));
}
