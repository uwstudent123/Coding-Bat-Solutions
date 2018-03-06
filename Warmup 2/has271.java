public boolean has271(int[] nums) {
  boolean flag = false;
  for (int i=0; i<nums.length - 2; i++) {
    int temp = nums[i];
    int ans = temp - 1;
    if (nums[i + 1] - 5 == temp && (nums[i + 2] == ans || nums[i + 2] + 1 == ans || nums[i + 2] + 2 == ans || nums[i + 2] - 1 == ans || nums[i + 2] - 2 == ans)) flag = true;
  }
  return flag;
}
