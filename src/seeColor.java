public class seeColor {
  public String seeColor(String str) {
    int len = str.length();
    if (len > 2 && str.substring(0, 3).equals("red")) {
      return "red";
    } else if (len > 3 && str.substring(0, 4).equals("blue")) {
      return "blue";
    } else {
      return "";
    }
  }
}
