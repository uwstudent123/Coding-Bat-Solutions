public boolean sleepIn(boolean weekday, boolean vacation) {
  if (vacation || !weekday) return true;
  return false;
}
