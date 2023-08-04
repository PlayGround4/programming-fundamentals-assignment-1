public class Demo5 {

  public static void main(String[] args) {
    int firstSet = 978;
    int secondSet = 3;
    int thirdSet = 16;
    int fourthSet = 1484100;

    String redColor = "\033[031m";
    String greenColor = "\033[032m";
    String yellowColor = "\033[033m";
    String blueColor = "\033[034m";
    String resetColor = "\033[0m";

    System.out.printf(
      "%s%d%s-%s%d%3$s-%s%d%3$s-%s%d%3$s \n",
      redColor,
      firstSet,
      resetColor,
      greenColor,
      secondSet,
      yellowColor,
      thirdSet,
      blueColor,
      fourthSet
    );
  }
}
