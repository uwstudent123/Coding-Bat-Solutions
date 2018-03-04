public int centeredAverage(int[] nums) {
  int[] temp = new int [nums.length - 2];
  Arrays.sort(nums);
  int idx = 0;
  for (int i=1; i<nums.length - 1; i++) {
    temp[idx++] = nums[i];
  }
  int mid = temp.length >> 1;
  if (temp.length % 2 == 1) {
    return temp[mid];
  }
  else return Math.round((temp[mid - 1] + temp[mid]) >> 1);
}