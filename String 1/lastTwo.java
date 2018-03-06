public String lastTwo(String str) {
  if (str.length() <= 1) return str;
    String temp = str.substring(str.length() - 2, str.length() - 1);
    String temp1 = str.substring(str.length() - 1, str.length());
    return str.substring(0, str.length() - 2) + temp1 + temp;
}