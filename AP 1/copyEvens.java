public int[] copyEvens(int[] nums, int count) {
  int even[] = new int [count];
  int cnt = 0;
  boolean flag [] = new boolean[nums.length];
  ArrayList<Integer> al = new ArrayList<Integer>();
  for (int i=0; i<nums.length; i++) {
    if (nums[i] % 2 == 0 && nums[i] != 0) {
      cnt++;
      al.add(nums[i]);
    }
    if (cnt == count) break;
  }
  for (int i=0; i<al.size(); i++) {
    if (al.get(i) != null && al.get(i) != 0 && i <= even.length) even[i] = al.get(i);
  }
  return even;
}