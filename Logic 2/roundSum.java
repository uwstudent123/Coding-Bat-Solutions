public int round10 (int num) {
  int digit = num % 10;
  if (num >= 10) {
    if (digit < 5) return (num - digit);
    else if (digit >= 5) return (num - digit) + 10;
  }
  else {
    if (digit < 5) return 0;
    else if (digit >= 5) return 10;
  }
  return 0;
}

public int roundSum(int a, int b, int c) {
  return round10(a) + round10(b) + round10(c);
}
