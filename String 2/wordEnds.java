public String wordEnds(String str, String word) {
  String ans = "";
  for (int i=0; i<str.length() - word.length() + 1; i++) {
    // Consider the chars both before and after the word
    if (i > 0 && i < str.length() - word.length() && str.substring(i, i + word.length()).equals(word)) ans += str.substring(i - 1, i) + str.substring(i + word.length(), i + word.length() + 1);
    // Consider the char just after the word
    else if (i < str.length() - word.length() && str.substring(i, i + word.length()).equals(word)) ans += str.substring(i + word.length(), i + word.length() + 1);
    // Consider the char just before the word
    else if (i > 0 && str.substring(i, i + word.length()).equals(word)) ans += str.substring(i - 1, i);
  }
  return ans;
}
