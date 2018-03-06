public boolean cigarParty(int cigars, boolean isWeekend) {
  boolean flag = false;
  if (isWeekend) {
    if (cigars >= 40) flag = true;
  }
  else {
    if (cigars >= 40 && cigars <= 60) flag = true;
  }
  return flag;
}
