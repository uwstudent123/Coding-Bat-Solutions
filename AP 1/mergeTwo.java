public String[] mergeTwo(String[] a, String[] b, int n) {
  String ans [] = new String[n];
  int idx1 = 0, idx2 = 0;
  for (int i=0; i<n; i++) {
    if (a[idx1].compareTo(b[idx2]) > 0) {
      ans[i] = b[idx2];
      idx2++;
    }
    else if (a[idx1].compareTo(b[idx2]) < 0) {
      ans[i] = a[idx1];
      idx1++;
    }
    else if (a[idx1].compareTo(b[idx2]) == 0) {
      ans[i] = a[idx1];
      idx1++;
      idx2++;
    }
  }
  return ans;
}
