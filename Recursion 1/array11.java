public int array11(int[] nums, int index) {
  if (index + 1 > nums.length) return 0;
  if (nums[index] == 11) return array11(nums, index + 1) + 1;
  return array11(nums, index + 1);
}
