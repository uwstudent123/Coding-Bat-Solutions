public int[] zeroMax(int[] nums) {
  int maxx = 0;
  for (int i=0; i<nums.length; i++) {
    if (nums[i] == 0) {
      maxx = 0;
      for (int j=i; j<nums.length; j++) {
       if (nums[j] % 2 == 1) maxx = Math.max(maxx, nums[j]);
      }
      nums[i] = maxx;
    }
  }
  return nums;
}
