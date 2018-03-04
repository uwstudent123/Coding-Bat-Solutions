public int scoresAverage(int[] scores) {
  int mid = scores.length / 2;
  int avg1 = average(scores, 0, mid - 1);
  int avg2 = average(scores, mid, scores.length - 1);
  if (avg1 < avg2) return avg2;
  return avg1;
}

public int average (int [] scores, int start, int end) {
  int sum = 0, avg = 0, cnt = 0;
  for (int i=start; i<=end; i++) {
    sum += scores[i];
    cnt++;
  }
  return (sum / cnt);
}
