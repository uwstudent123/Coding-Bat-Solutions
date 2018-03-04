public int[] pre4(int[] nums) {
  int idx = Arrays.binarySearch(nums, 4);
  int ans[] = new int [idx];
  if (idx == -1 || idx == 0) return new int [] {};
  else if (idx != -1) {
    for (int i=0; i<idx; i++) {
      ans[i] = nums[i];
    }
  }
  return ans;
}
