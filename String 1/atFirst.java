public String atFirst(String str) {
  if (str.length() < 2) {
    if (!str.equals("")) return str.substring(0, 1) + "@";
    return "@@";
  }
  return str.substring(0, 2);
}
