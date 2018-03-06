public boolean shareDigit(int a, int b) {
  if (String.valueOf(a).charAt(0) == String.valueOf(b).charAt(0) || String.valueOf(a).charAt(1) == String.valueOf(b).charAt(1) || String.valueOf(a).charAt(0) == String.valueOf(b).charAt(1) || String.valueOf(a).charAt(1) == String.valueOf(b).charAt(0)) return true;
  return false;
}
