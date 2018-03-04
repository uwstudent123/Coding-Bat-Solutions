public int[] fix34(int[] nums) {
  int start = 0;
  for (int i = 0; i < nums.length; ++i) {
    if (nums[i] == 3) {
      for (int j = start; j < nums.length; ++j) {
        if (nums[j] == 4) {
          nums[j] = nums[i + 1];
          nums[i + 1] = 4;
          start = j + 1;
          break;
        }
      }
    }
  }
  return nums;
}