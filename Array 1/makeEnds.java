public int[] makeEnds(int[] nums) {
  if (nums.length == 1) return new int [] {nums[0], nums[0]};
  if (nums.length <= 2) return nums;
  int arr [] = new int [2];
  arr[0] = nums[0];
  arr[1] = nums[nums.length - 1];
  return arr;
}
