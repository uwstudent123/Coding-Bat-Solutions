public String nTwice(String str, int n) {
  String temp1 = str.substring(0, n);
  String temp2 = str.substring(str.length() - n, str.length());
  return temp1 + temp2;
}
