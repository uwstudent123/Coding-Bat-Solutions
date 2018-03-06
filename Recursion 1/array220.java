public boolean array220(int[] nums, int index) {
  if (index + 2 > nums.length) return false;
  if (nums[index + 1] == nums[index] * 10) return true;
  return array220(nums, index + 1);
}
