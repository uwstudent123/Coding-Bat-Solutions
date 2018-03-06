public String missingChar(String str, int n) {
  String a = str.substring(0, n);
  String b = str.substring(n + 1);
  return a + b;
}
