public boolean nearTen(int num) {
  for (int i=0; i<=1000000; i+=10) {
    if (num == i - 2 || num == i + 2 || num == i - 1 || num == i + 1 || num == i) return true;
  }
  return false;
}
