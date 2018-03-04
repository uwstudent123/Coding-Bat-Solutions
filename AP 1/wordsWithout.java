public String[] wordsWithout(String[] words, String target) {
  ArrayList<String> al = new ArrayList<String>();
  int cnt = 0;
  for (int i=0; i<words.length; i++) {
    if (!words[i].equals(target)) {
      al.add(words[i]);
      cnt++;
    }
  }
  int idx = 0;
  String ans [] = new String[al.size()];
  for (String i : al) {
    ans[idx++] = i;
  }
  return ans;
}
