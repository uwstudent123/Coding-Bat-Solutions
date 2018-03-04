public int[] seriesUp(int n) {
  int arr [] = new int [(n * (n + 1)) >> 1];
  int idx = 0;
  for (int i=1; i<=n; i++) {
    for (int j=0; j<i; j++) arr[idx + j] = j + 1;
    idx += i;
  }
  return arr;
}
