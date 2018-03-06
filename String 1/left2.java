public String left2(String str) {
  StringBuilder sb = new StringBuilder(100);
  String temp1 = str.substring(0, 2);
  String temp2 = str.substring(2, str.length());
  return temp2 + temp1;
}
