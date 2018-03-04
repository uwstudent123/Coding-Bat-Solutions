public int bigHeights(int[] heights, int start, int end) {
  int cnt = 0;
  for (int i=start; i<end; i++) {
    if (Math.abs(heights[i + 1] - heights[i]) >= 5) cnt++;
  }
  return cnt;
}
