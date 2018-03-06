public String stringSplosion(String str) {
  String temp = "";
  temp += str.charAt(0);
  for (int i=2; i<=str.length(); i++) {
    temp += str.substring(0, i);
  }
  return temp;
}
