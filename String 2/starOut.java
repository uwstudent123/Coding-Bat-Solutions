public String starOut(String str) {
  String ans = "";
  for (int i=0; i<str.length(); i++) {
    if ((i > 0 && str.substring(i - 1, i).equals("*")) || (i < str.length() - 1 && str.substring(i + 1, i + 2).equals("*")) || (str.substring(i, i + 1).equals("*"))) continue;
    ans += str.substring(i, i + 1);
  }
  return ans;
}
