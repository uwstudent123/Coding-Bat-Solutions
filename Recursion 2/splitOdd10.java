public boolean splitArray (int start, int[] nums, int multiple, int odd) {
  if (start >= nums.length) return (multiple % 10 == 0 && odd % 2 == 1);
  if (splitArray(start + 1, nums, multiple + nums[start], odd)) return true;
  if (splitArray(start + 1, nums, multiple, odd + nums[start])) return true;
  return false;
}

public boolean splitOdd10(int[] nums) {
  return splitArray(0, nums, 0, 0);
}
