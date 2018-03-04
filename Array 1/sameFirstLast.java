public boolean sameFirstLast(int[] nums) {
  if (nums.length < 1) return false;
  if (nums[0] == nums[nums.length - 1]) return true;
  return false;
}
