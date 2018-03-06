public String[] allSwap(String[] strings) {
  HashMap<String, Integer> hm = new HashMap<String, Integer>();
  String temp;
  for (int i=0; i<strings.length; i++) {
    if (hm.containsKey(strings[i].substring(0, 1))) { // Matches
      // Swap
      temp = strings[i];
      strings[i] = strings[hm.get(strings[i].substring(0, 1))];
      strings[hm.get(strings[i].substring(0, 1))] = temp;
      hm.remove(strings[i].substring(0, 1));
    }
    else if (hm.get(strings[i].substring(0, 1)) == null) hm.put(strings[i].substring(0, 1), i);
  }
  return strings;
}