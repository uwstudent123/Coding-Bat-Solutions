public Map<String, String> mapAB3(Map<String, String> map) {
  if (map.containsKey("a") && !map.containsKey("b")) {
    if (map.get("a") != null) {
      map.put("b", map.get("a"));
    }
  }
  if (map.containsKey("b") && !map.containsKey("a")) {
    if (map.get("b") != null) {
      map.put("a", map.get("b"));
    }
  }
  return map;
}
