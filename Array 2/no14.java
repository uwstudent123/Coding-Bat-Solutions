public boolean no14(int[] nums) {
  boolean flag = false;
  ArrayList<Integer> al = new ArrayList<Integer>();
  for (int i : nums) {
    al.add(i);
  }
  if ((al.contains(1) && !al.contains(4)) || (al.contains(4) && !al.contains(1)) || (!al.contains(1) && !al.contains(4))) flag = true;
  return flag;
}
