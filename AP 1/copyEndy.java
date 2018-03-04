public int[] copyEndy(int[] nums, int count) {
  int arr [] = new int [count];
  ArrayList<Integer> al = new ArrayList<Integer>();
  int cnt = 0;
  for (int i=0; i<nums.length; i++) {
    if (nums[i] >= 0 && nums[i] <= 10 || nums[i] >= 90 && nums[i] <= 100) {
      cnt++;
      al.add(nums[i]);
    }
    if (cnt == count) break;
  }
  for (int i=0; i<al.size(); i++) {
    if (al.get(i) != null && i <= arr.length) {
      arr[i] = al.get(i);
    }
  }
  return arr;
}