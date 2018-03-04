public boolean double23(int[] nums) {
  int cnt = 0, cnt1 = 0;
  for (int i=0; i<nums.length; i++) {
    if (nums[i] == 2) cnt++;
    if (nums[i] == 3) cnt1++;
  }
  if (cnt == 2 || cnt1 == 2) return true;
  return false;
}
