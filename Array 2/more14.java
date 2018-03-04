public boolean more14(int[] nums) {
  int cnt1 = 0, cnt2 = 0;
  for (int i : nums) {
    if (i == 1) cnt1++;
    if (i == 4) cnt2++;
  }
  return cnt1 > cnt2;
}
