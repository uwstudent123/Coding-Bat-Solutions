public String front22(String str) {
  if (str.length()<2) {
    return str + str + str;
  }
  else {
    return String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(1)) + str + String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(1));
  }
}
