public List wordsWithoutList(String[] words, int len) {
  ArrayList<String> al = new ArrayList<String>(len);
  for (int i=0; i<words.length; i++) {
    if (words[i].length() != len) al.add(words[i]);
  }
  return al;
}
