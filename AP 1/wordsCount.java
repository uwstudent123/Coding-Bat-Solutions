public int wordsCount(String[] words, int len) {
  int cnt = 0;
  for (String s : words) {
    if (s.length() == len) cnt++;
  }
  return cnt;
}
