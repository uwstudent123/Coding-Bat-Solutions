public Map<String, Integer> wordCount(String[] strings) {
  Map<String, Integer> mp = new HashMap<String, Integer>();
  for (String s : strings) {
    if (!mp.containsKey(s)) mp.put(s, 1);
    else {
      mp.put(s, mp.get(s) + 1);
    }
  }
  return mp;
}
