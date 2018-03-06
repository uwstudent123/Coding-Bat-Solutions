public String wordAppend(String[] strings) {
  HashMap<String, Integer> hm = new HashMap<String, Integer>();
  String res = "";
  for (String s : strings) {
    if (hm.get(s) == null) {
      hm.put(s, 1);
    }
    else if (hm.containsKey(s)) {
      hm.remove(s);
      res += s;
    }
  }
  return res;
}