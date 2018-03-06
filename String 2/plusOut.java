public String plusOut(String str, String word) {
  String ans = "";
  for (int i=0; i<str.length(); i++) {
    if (i < str.length() - word.length() + 1 && str.substring(i, i + word.length()).equals(word)) {
      ans += word;
      i += word.length() - 1;
    }
    else ans += "+";
  }
  return ans;
}
