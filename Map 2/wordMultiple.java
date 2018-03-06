public Map<String, Boolean> wordMultiple(String[] strings) {
  HashMap<String, Integer> hm = new HashMap<String, Integer>();
  for (String s : strings) {
    if (hm.get(s) == null) hm.put(s, 1);
    else if (hm.get(s) != null) hm.put(s, hm.get(s) + 1);
  }
  HashMap<String, Boolean> hm1 = new HashMap<String, Boolean>();
  for (String s : strings) {
    if (hm.get(s) >= 2) {
      hm1.put(s, true);
    }
    else hm1.put(s, false);
  }
  return hm1;
}
