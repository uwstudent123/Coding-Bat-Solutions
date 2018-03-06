public String sameEnds(String string) {
  String ans = "";
  for (int i=0; i<string.length() >> 1; i++) {
    if (string.substring(0, i + 1).equals(string.substring(string.length() - i - 1))) ans = string.substring(0, i + 1);
  }
  return ans;
}