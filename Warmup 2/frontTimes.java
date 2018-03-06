public String frontTimes(String str, int n) {
  String ans = "";
  if (str.length() < 3) {
    for (int i=0; i<n; i++) ans += str;
  }
  else {
    String temp = str.substring(0, 3);
    for (int i=0; i<n; i++) ans += temp;
  }
  return ans;
}
