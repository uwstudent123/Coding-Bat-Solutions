public boolean scoresClump(int[] scores) {
  boolean flag = false;
  for (int i=1; i<scores.length - 1; i++) {
    if (Math.abs(scores[i] - scores[i - 1]) <= 2 && Math.abs(scores[i] - scores[i + 1]) <= 2 && Math.abs(scores[i - 1] - scores[i + 1]) <= 2) {
      flag = true;
      break;
    }
    else flag = false;
  }
  return flag;
}
