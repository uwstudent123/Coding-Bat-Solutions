public boolean groupSum6(int start, int[] nums, int target) {
  if (start == nums.length) return target == 0;
  if (nums[start] % 6 == 0) return groupSum6(start + 1, nums, target - 6);
  return (groupSum6(start + 1, nums, target - nums[start]) || groupSum6(start + 1, nums, target));
}
