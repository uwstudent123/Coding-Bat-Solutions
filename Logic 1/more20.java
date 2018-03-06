public boolean more20(int n) {
  for (int i=0; i<=100000; i+=20) {
    if (n == i + 1 || n == i + 2) return true;
  }
  return false;
}
