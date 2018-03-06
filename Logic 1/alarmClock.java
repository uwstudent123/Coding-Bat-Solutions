public String alarmClock(int day, boolean vacation) {
  boolean weekend = false;
  boolean weekday = false;
  if (day >= 1 && day <= 5) weekday = true;
  else if (day == 0 || day == 7 || day == 6) weekend = true;
if (!vacation) {
  if (weekday) {
    return "7:00";
  }
  else if (weekend) {
    return "10:00";
  }
}
else {
  if (weekday) return "10:00";
  else if (weekend) return "off";
}
return "off";
}
