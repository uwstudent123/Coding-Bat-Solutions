public String zipZap(String str) {
  String ans = "", temp = "";
  for (int i=0; i<str.length(); i++) {
    if (i > 0 && i < str.length() - 1 && str.substring(i - 1, i + 2).matches("z.p")) continue;
    ans += str.substring(i, i + 1);
  }
  return ans;
}
