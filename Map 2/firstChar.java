public Map<String, String> firstChar(String[] strings) {
  Map<String, String> mp = new HashMap<String, String>();
  for (String s : strings) {
    String last = "";
    String temp = String.valueOf(s.charAt(0));
    if (mp.get(temp) == null) {
      mp.put(temp, s);
    }
    else if (mp.get(temp) != null) {
      mp.put(temp, mp.get(temp) + s);
    }
    last = s;
  }
  return mp;
}