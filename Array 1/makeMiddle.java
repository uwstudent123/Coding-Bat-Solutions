public int[] makeMiddle(int[] nums) {
  int arr [] = new int [2];
  int mid = nums.length >> 1;
  arr = new int [] {nums[mid - 1], nums[mid]};
  return arr;
}
