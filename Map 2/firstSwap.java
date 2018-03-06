public String[] firstSwap(String[] strings) {
  HashMap<String, Integer> hm = new HashMap<String, Integer>();
  HashMap<String, Boolean> hm1 = new HashMap<String, Boolean>();
  String temp;
  int cnt = 0;
  boolean flag = false;
  for (int i=0; i<strings.length; i++) {
    if (hm.containsKey(strings[i].substring(0, 1)) && !hm1.get(strings[i].substring(0, 1))) { // Matches
      // Swap
      temp = strings[i];
      strings[i] = strings[hm.get(strings[i].substring(0, 1))];
      strings[hm.get(strings[i].substring(0, 1))] = temp;
      //hm.remove(strings[i].substring(0, 1));
      hm1.put(strings[i].substring(0, 1), true);
      flag = true;
    }
    else if (hm.get(strings[i].substring(0, 1)) == null) {
      hm.put(strings[i].substring(0, 1), i);
      hm1.put(strings[i].substring(0, 1), false);
    }
  }
  return strings;
}