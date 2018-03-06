public Map<String, Integer> word0(String[] strings) {
  Map<String, Integer> mp = new HashMap<String, Integer>();
  for (String s : strings) {
    if (mp.get(s) == null) mp.put(s, 0);
  }
  return mp;
}
