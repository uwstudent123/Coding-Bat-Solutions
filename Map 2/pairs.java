public Map<String, String> pairs(String[] strings) {
  Map<String, String> mp = new HashMap<String, String>();
  for (String s : strings) {
    mp.put(String.valueOf(s.charAt(0)), String.valueOf(s.charAt(s.length() - 1)));
  }
  return mp;
}
