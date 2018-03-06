public int diff21(int n) {
  int diff = n - 21;
  if (diff < 0) diff *= -1;
  if (n > 21) return 2 * diff;
  return diff;
}
