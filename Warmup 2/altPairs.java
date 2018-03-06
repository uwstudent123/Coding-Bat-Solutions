public String altPairs(String str) {
  String a = "";
  for (int i=0; i<str.length(); i+=4) {
    if (i == str.length() - 1) a += str.substring(i, i + 1);
    else a += str.substring(i, i + 2);
  }
  return a;
}