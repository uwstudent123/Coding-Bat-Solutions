public String repeatEnd(String str, int n) {
  String ans = "", temp = str.substring(str.length() - n);
  for (int i=0; i<n; i++) {
    ans += temp;
  }
  return ans;
}
