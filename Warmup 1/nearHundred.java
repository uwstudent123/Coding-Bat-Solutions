public boolean nearHundred(int n) {
  if (n > 0) 
  if ((Math.abs(n) >= 90 && Math.abs(n) <= 110) || (Math.abs(n) >= 190 && Math.abs(n) <= 210)) return true;
  return false;
}
