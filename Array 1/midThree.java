public int[] midThree(int[] nums) {
  int mid = nums.length >> 1;
  int arr [] = new int [] {nums[mid - 1], nums[mid], nums[mid + 1]};
  return arr;
}
