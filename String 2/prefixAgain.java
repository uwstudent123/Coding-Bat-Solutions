public boolean prefixAgain(String str, int n) {
  boolean flag = false;
  String temp = str.substring(0, n);
  for (int i=temp.length(); i<str.length(); i++) {
    for (int j=i + 1; j<=str.length(); j++) {
      if (str.substring(i, j).equals(temp)) flag = true;
    }
  }
  return flag;
}