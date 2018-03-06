boolean doubleX(String str) {
  int idx = str.indexOf('x');
  if (idx < str.length() - 1 && idx != -1) {
    if (str.substring(idx, idx + 2).equals("xx")) return true;
  }
  return false;
}
