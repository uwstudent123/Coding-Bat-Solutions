public boolean has12(int[] nums) {
  int idx1 = -1, idx2 = -1;
  for (int i=0; i<nums.length; i++) {
    if (nums[i] == 1) idx1 = i;
    else if (nums[i] == 2) idx2 = i;
  }
  if (idx1 == -1) return false;
  return idx1 < idx2;
}
