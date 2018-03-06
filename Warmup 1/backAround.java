public String backAround(String str) {
  char temp = str.charAt(str.length() - 1);
  return String.valueOf(temp) + str + String.valueOf(temp);
}
