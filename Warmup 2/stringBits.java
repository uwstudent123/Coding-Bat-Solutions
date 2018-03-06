public String stringBits(String str) {
  String ans = "";
  for (int i=0; i<str.length(); i+=2) ans += str.charAt(i);
  return ans;
}
