public int[] rotateLeft3(int[] nums) {
  int arr [] = new int [nums.length];
  for (int i=1; i<nums.length; i++) {
    arr[i - 1] = nums[i];
  }
  arr[arr.length - 1] = nums[0];
  return arr;
}