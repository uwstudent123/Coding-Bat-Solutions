public boolean inOrder(int a, int b, int c, boolean bOk) {
  if (!bOk) {
    if (b > a && c > b) return true;
  }
  else {
    if (c > b) return true;
  }
  return false;
}
