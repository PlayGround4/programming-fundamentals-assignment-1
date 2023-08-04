public class Demo4 {

  public static void main(String[] args) {
    int day = 28;
    int month = 12;
    int year = 2023;
    int hour = 23;
    int minute = 59;
    int second = 59;

    String redColor = "\033[031m";
    String greenColor = "\033[032m";
    String yellowColor = "\033[033m";
    String blueColor = "\033[034m";
    String purpleColor = "\033[035m";
    String lightBlueColor = "\033[036m";
    String resetColor = "\033[0m";

    System.out.printf(
      "%s%d%s/%s%d%3$s/%s%d %s%d%3$s:%s%d%3$s:%s%d%3$s \n",
      redColor,
      month,
      resetColor,
      greenColor,
      day,
      yellowColor,
      year,
      blueColor,
      hour,
      purpleColor,
      minute,
      lightBlueColor,
      second
    );
  }
}
