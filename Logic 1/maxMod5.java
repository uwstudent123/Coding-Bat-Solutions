public int maxMod5(int a, int b) {
  boolean as = false;
  if (a < b) as = true;
  if (a % 5 == b % 5 && a != b) {
    if (as) return a;
    else return b;
  }
  if (a == b) {
    return 0;
  }
  return as ? b : a;
}
