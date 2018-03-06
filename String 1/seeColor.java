public String seeColor(String str) {
  int idx = 0;
  if (str.startsWith("red")) { return str.substring(0, 3); }
  if (str.startsWith("blue")) { return str.substring(0, 4); }
  return "";
}
