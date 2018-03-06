public String mirrorEnds(String string) {
  String ans = "";
  for (int i=0; i<string.length(); i++) {
    if (string.substring(i, i + 1).equals(string.substring(string.length() - i - 1, string.length() - i))) ans += string.substring(i, i + 1);
    else break;
  }
  return ans;
}