public int[] fix45(int[] nums) {
  boolean[] visited = new boolean[nums.length];
  int temp = 0;
  for (int i=0; i<nums.length; i++) {
    if (nums[i] == 4) {
      for (int j=0; j<nums.length; j++) {
        if ((nums[j] == 5) && ((j == 0) || (!visited[j - 1]))) {
          temp = nums[i + 1];
          nums[i + 1] = 5;
          nums[j] = temp;
          visited[i] = true;
          break;
        }
      }
    }
  }
  return nums;
}