public int[] notAlone(int[] nums, int val) {
  for (int i=0; i<nums.length; i++) {
    if (i > 0 && i < nums.length - 1) {
      if (nums[i] == val && nums[i - 1] != val && nums[i + 1] != val) {
        nums[i] = nums[i - 1] > nums[i + 1] ? nums[i - 1] : nums[i + 1];
      }
    }
  }
  return nums;
}
