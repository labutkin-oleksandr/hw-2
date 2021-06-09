public String decode(String name) {            
  String decodename = name.replace("1", "e").replace("2", "u").replace("3", "i").replace("4", "o").replace("5", "a").replace("YESNOTFORYOU", "").replace("NOTFORYOU", "");
  return decodename;     
}
