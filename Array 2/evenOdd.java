public int[] evenOdd(int[] nums) {
  int swapp = 0;
  for (int i=0; i<nums.length; i++) {
    if (nums[i] % 2 == 1) {
      for (int j=i; j<nums.length; j++) {
        if (nums[j] % 2 == 0) {
          swapp = nums[i];
          nums[i] = nums[j];
          nums[j] = swapp;
        }
      }
    }
  }
  return nums;
}
