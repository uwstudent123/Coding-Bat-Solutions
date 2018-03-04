public boolean haveThree(int[] nums) {
  boolean flag = false, temp = true;
  int cnt = 0;
  for (int i=0; i<nums.length - 1; i++) {
    temp &= !(nums[i] == 3 && nums[i + 1] == 3);
  }
  for (int i : nums) {
    if (i == 3) cnt++;
  }
  if (cnt == 3 && temp) flag = true;
  return flag;
}
