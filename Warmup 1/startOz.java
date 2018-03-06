public String startOz(String str) {
  if (str.length() >= 2) {
    if (str.charAt(0) == 'o' && str.charAt(1) != 'z') return String.valueOf(str.charAt(0));
    else if (str.charAt(0) != 'o' && str.charAt(1) == 'z') return String.valueOf(str.charAt(1));
    else if (str.charAt(0) == 'o' && str.charAt(1) == 'z') return String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(1));
  }
  else if (str.length() == 1) return str;
  return "";
}
