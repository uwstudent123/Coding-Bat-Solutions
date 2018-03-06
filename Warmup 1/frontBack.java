public String frontBack(String str) {
  if (str.equals("")) return "";
  else {
    if (str.length() == 1) return str;
    char a = str.charAt(0);
    char b = str.charAt(str.length() - 1);
    String s = str.substring(1, str.length()-1);
    String temp = b + s + a;
    return temp;
  }
}
