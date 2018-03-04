public int[] shiftLeft(int[] nums) {
  if (nums.length <= 1) return nums;
  int temp[] = new int[nums.length];
  temp[0] = nums[1];
  temp[nums.length - 1] = nums[0];
  int idx = 1;
  for (int i=2; i<nums.length; i++) temp[idx++] = nums[i];
  return temp;
}
