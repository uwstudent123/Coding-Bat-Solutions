public Map<String, Integer> wordLen(String[] strings) {
  Map<String, Integer> mp = new HashMap<String, Integer>();
  for (String s : strings) {
    if (mp.get(s) == null) mp.put(s, s.length());
  }
  return mp;
}
