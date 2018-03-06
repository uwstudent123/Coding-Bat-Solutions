public String startWord(String str, String word) {
  if (str.equals("") || word.equals("")) return "";
  String temp1 = word.substring(1);
  if (str.length() == 1 && word.length() == 1) return str;
  if (str.length() > 2) if (str.substring(1, word.length()).equals(temp1)) return str.substring(0, 1) + temp1;
  return "";
}