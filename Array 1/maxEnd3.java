public int[] maxEnd3(int[] nums) {
  int val = 0;
  if (nums[0] < nums[nums.length - 1]) val = nums[nums.length - 1];
  else val = nums[0];
  Arrays.fill(nums, val);
  return nums;
}
