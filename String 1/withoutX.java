public String withoutX(String str) {
  if (str.length() == 1 || str.equals("")) return "";
  if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) != 'x') return str.substring(1);
  if (str.charAt(0) != 'x' && str.charAt(str.length() - 1) == 'x') return str.substring(0, str.length() - 1);
  if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') return str.substring(1, str.length() - 1);
  return str;
}
