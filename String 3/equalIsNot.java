public boolean equalIsNot(String str) {
  int cnt1 = 0, cnt2 = 0;
  for (int i=0; i<str.length() - 1; i++) {
    if (str.substring(i, i + 2).equals("is")) cnt1++;
  }
  for (int i=0; i<str.length() - 2; i++) {
    if (str.substring(i, i + 3).equals("not")) cnt2++;
  }
  return cnt1 == cnt2;
}
