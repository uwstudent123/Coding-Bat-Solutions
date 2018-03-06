public int greenTicket(int a, int b, int c) {
  if (a != b && b != c && a != c) return 0;
  if (a == b && a == c && b == c) return 20;
  if (a == b || b == c || a == c) return 10;
  return 0;
}
