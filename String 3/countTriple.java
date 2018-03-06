public int countTriple(String str) {
  int cnt = 0;
  for (int i=0; i<str.length(); i++) {
    if (i < str.length() - 2) {
      if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 1) == str.charAt(i + 2)) cnt++;
    }
  }
  return cnt;
}