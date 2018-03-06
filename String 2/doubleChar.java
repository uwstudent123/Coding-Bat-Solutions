public String doubleChar(String str) {
  String temp = "";
  for (int i=0; i<str.length(); i++) {
    temp += String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i));
  }
  return temp;
}
