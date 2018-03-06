public String oneTwo(String str) {
  String ans = "";
  if (str.length() < 3) return "";
  for (int i=0; i<str.length() - 2; i += 3) {
    ans += str.substring(i + 1, i + 3) + str.substring(i, i + 1);
  }
  return ans;
}
