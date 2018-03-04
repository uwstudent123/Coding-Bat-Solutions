public boolean scores100(int[] scores) {
  boolean flag = false;
  for (int i=1; i<scores.length - 1; i++) {
    if (scores[i] == 100 && scores[i + 1] == 100 || scores[i - 1] == 100 && scores[i] == 100) flag = true;
    else flag = false;
  }
  return flag;
}
