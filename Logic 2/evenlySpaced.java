public boolean evenlySpaced(int a, int b, int c) {
  int minn = Math.min(a, Math.min(b, c));
  int maxx = Math.max(a, Math.max(b, c));
  int mid = 0;
  if ((minn == a && maxx == b) || (minn == b && maxx == a)) mid = c;
  else if ((minn == a && maxx == c) || (minn == c && maxx == a)) mid = b;
  else if ((minn == b && maxx == c) || (minn == c && maxx == b)) mid = a;
  if (Math.abs(minn - mid) == Math.abs(maxx - mid)) return true;
  return false;
}
