public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  if (!equalOk) {
    if (a < b && a < c && b < c) return true;
  }
  else {
    if (a == b && b < c) return true;
    if (b == c && a < b) return true;
    if (a == c && b < c) return true;
    if (a == c && b == c && a == c) return true;
  }
  return false;
}
