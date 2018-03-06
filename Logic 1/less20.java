public boolean less20(int n) {
  for (int i=0; i<=1000000; i+=20) {
    if (n == i - 1 || n == i - 2) return true;
  }
  return false;
}
