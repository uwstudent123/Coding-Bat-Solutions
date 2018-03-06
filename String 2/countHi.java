public int countHi(String s) {
  int cnt = 0;
  for (int i=0; i<s.length(); i++) {
    for (int j=i + 1; j<=s.length(); j++) {
      if (s.substring(i, j).equals("hi")) cnt++;
    }
  }
  return cnt;
}