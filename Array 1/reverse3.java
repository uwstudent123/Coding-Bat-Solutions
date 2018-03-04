public int[] reverse3(int[] nums) {
    ArrayList<Integer> al = new ArrayList<Integer>();
    int arr [] = new int [nums.length];
    for (int i : nums) al.add(i);
    Collections.reverse(al);
    Integer temp [] = al.toArray(new Integer[al.size()]);
    arr = Arrays.stream(temp).mapToInt(Integer::intValue).toArray();
    return arr;
  }