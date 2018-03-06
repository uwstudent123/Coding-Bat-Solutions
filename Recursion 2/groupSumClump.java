public boolean groupSumClump(int start, int[] nums, int target) {
  int cnt = 0;
  if (start == nums.length) return target == 0;
  for (int i=start; i + 1<=nums.length; i++) {
    if (nums[start] == nums[i]) cnt++;
    else break;
  }
  return (groupSumClump(start + cnt, nums, target - nums[start] * cnt) || groupSumClump(start + cnt, nums, target));
}
