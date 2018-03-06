int countXX(String str) {
  int cnt = 0;
  for (int i=0; i<str.length(); i++) {
    for (int j=i + 1; j<=str.length(); j++)
      if (str.substring(i, j).equals("xx")) cnt++;
  }
  return cnt;
}
