public int maxMirror(int[] nums) {
  int ans = 0, cnt = 0;
  for (int i=0; i<nums.length; i++) {
    for (int j=nums.length - 1; j>=0; j--) {
      cnt = 0;
      int temp1 = i, temp2 = j;
      while (temp1 < nums.length && temp2 >= 0 && nums[temp1] == nums[temp2]) {
        temp1++;
        temp2--;
        cnt++;
      }
      ans = Math.max(ans, cnt);
    }
  }
  return ans;
}
