public int[] post4(int[] nums) {
  int idx = 0;
  for (int i=0; i<nums.length; i++) {
    if (nums[i] == 4) idx = i;
  }
  int ans[] = new int [nums.length - idx - 1];
  int temp = 0;
  for (int i=idx + 1; i<nums.length; i++) ans[temp++] = nums[i];
  return ans;
}
