public String repeatSeparator(String word, String sep, int count) {
  String ans = "";
  if (count == 0) return ans;
  for (int i=0; i<count - 1; i++) {
    ans += word + sep;
  }
  return ans + word;
}
