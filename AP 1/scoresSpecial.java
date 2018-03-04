int GetLargest (int arr[]) {
  int maxx = 0;
  for (int i=0; i<arr.length; i++) {
    if (arr[i] % 10 == 0) {
      maxx = Math.max(maxx, arr[i]);
    }
  }
  return maxx;
}

public int scoresSpecial(int[] a, int[] b) {
  return GetLargest(a) + GetLargest(b);
}
