public int[] zeroFront(int[] nums) {
  int[] temp = new int [nums.length];
  Arrays.sort(nums);
  int idx = 0, cnt = 0;
  for (int i=0; i<nums.length; i++) {
    if (nums[i] < 0) {
      temp[i] = nums[i];
      cnt++;
    }
  }
  for (int i=nums.length - cnt; i<nums.length; i++) nums[i] = temp[i + cnt - nums.length];
  for (int i=0; i<cnt; i++) nums[i] = 0;
  return nums;
}
