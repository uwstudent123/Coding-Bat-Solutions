public boolean scoresIncreasing(int[] scores) {
  boolean flag = false;
  int last = 0;
  for (int i=1; i<scores.length - 1; i++) {
    if (scores[i] >= scores[i - 1] && scores[i + 1] >= scores[i]) flag = true;
    else flag = false;
  }
  return flag;
}
