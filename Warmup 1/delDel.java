public String delDel(String str) {
  if (str.length() == 0) return "";
  if (str.substring(1).startsWith("del")) return str.replace("del", "");
  return str;
}
