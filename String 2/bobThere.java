public boolean bobThere(String str) {
  for (int i=0; i<=str.length() - 3; i++) {
    if (str.substring(i, i + 1).equals("b") && str.substring(i + 2, i + 3).equals("b")) return true;
  }
  return false;
}
