public String without2(String str) {
  if (str.length() == 2 || str.equals("")) return "";
  if (str.length() == 1) return str;
  if (str.substring(0, 2).length() <= 2 && str.substring(str.length() - 2, str.length()).length() <= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))) return str.substring(2);
  return str;
}
