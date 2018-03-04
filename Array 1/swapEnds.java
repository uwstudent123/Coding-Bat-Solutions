public int[] swapEnds(int[] nums) {
  if (nums.length > 1) {
    int temp = nums[0];
    nums[0] = nums[nums.length - 1];
    nums[nums.length - 1] = temp;
  }
  if (nums.length == 1) return nums;
  return nums;
}
