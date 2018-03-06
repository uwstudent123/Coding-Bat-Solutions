public int maxBlock(String str) {
  int cnt = 0, ans = 0;
  char last = '$';
  for (int i=0; i<str.length(); i++) {
    if (str.charAt(i) == last) cnt++;
    else {
      ans = Math.max(ans, cnt);
      last = str.charAt(i);
      cnt = 1;
    }
  }
  return Math.max(ans, cnt);
}
