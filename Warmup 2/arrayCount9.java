public int arrayCount9(int[] nums) {
  int cnt = 0;
  for (int i : nums) {
    if (i == 9) cnt++;
  }
  return cnt;
}
