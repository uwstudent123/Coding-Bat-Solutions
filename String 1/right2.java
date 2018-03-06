public String right2(String str) {
  String temp1 = str.substring(str.length() - 2, str.length());
  String temp2 = str.substring(0, str.length() - 2);
  return temp1 + temp2;
}
