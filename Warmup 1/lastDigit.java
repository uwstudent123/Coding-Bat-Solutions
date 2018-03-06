public boolean lastDigit(int a, int b) {
  if (String.valueOf(a).charAt(String.valueOf(a).length() - 1) == (String.valueOf(b).charAt(String.valueOf(b).length() - 1))) return true;
  return false;
}
