public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if (!isAsleep) {
    if (!isMorning) return true;
    else if (isMorning) {
      if (isMom) return true;
      else return false;
    }
  }
 return false;
}
