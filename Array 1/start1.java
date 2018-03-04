public int start1(int[] a, int[] b) {
  int cnt = 0;
  if (a.length == 0 && b.length == 0) return 0;
  if (a.length == 0) {
    if (b[0] == 1) cnt = 1;
  }
  if (b.length == 0) if (a[0] == 1) cnt = 1;
  if (a.length > 0 && b.length > 0) {
    if (a[0] == 1 && b[0] == 1) cnt = 2;
    else if (a[0] == 1 || b[0] == 1) cnt = 1;
  }
  return cnt;
}
