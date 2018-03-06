public String repeatFront(String str, int n) {
  String ans = "", temp = str.substring(0, n);
  for (int i=0; i<n; i++) {
    ans += temp;
    temp = temp.substring(0, temp.length() - 1);
  }
  return ans;
}
