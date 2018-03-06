public int blackjack(int a, int b) {
  if (a > 21 && b > 21) return 0;
  if (a <= 21 && b <= 21) {
    if (Math.abs(21 - a) < Math.abs(21 - b)) return a;
    else return b;
  }
  else if (a <= 21 && b > 21) {
    return a;
  }
  return b;
}
