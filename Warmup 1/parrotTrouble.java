public boolean parrotTrouble(boolean talking, int hour) {
  if (talking && (hour > 20 || hour < 7)) return true;
  return false;
}
