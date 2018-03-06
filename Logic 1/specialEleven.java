public boolean specialEleven(int n) {
  for (int i=0; i<10000; i+=11) {
    if (n % 11 == 0 || n == i + 1) return true;
  }
  return false;
}
