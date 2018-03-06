public int teaParty(int tea, int candy) {
  if (tea >= 5 && candy >= 5 && tea < candy * 2 && candy < tea * 2) return 1;
  else if ((tea >= candy * 2 || candy >= tea * 2) && tea >= 5 && candy>= 5) return 2;
  return 0;
}
