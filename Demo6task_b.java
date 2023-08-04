public class Demo6task_b {

  public static void main(String[] args) {
    String yellowColor = "\033[033m";
    String blueColor = "\033[034;1m";
    String purplrColor = "\033[035m";
    String resetColor = "\033[0m";

    String name1 = "Alice";
    String name2 = "Bob";

    int age1 = 24;
    int age2 = 30;

    System.out.printf("%s+", yellowColor);
    System.out.printf("-".repeat(15));
    System.out.print("+");
    System.out.print("-".repeat(5));
    System.out.printf("+ \n");

    System.out.printf(
      "| %s%-14s%s%s| %1$s%s%3$s%4$s |",
      blueColor,
      "NAME",
      resetColor,
      yellowColor,
      "AGE"
    );

    System.out.printf("\n%s+", yellowColor);
    System.out.printf("-".repeat(15));
    System.out.print("+");
    System.out.print("-".repeat(5));
    System.out.printf("+ \n");

    System.out.printf(
      "| %s%-14s%s|  %s%d %3$s| \n",
      resetColor,
      name1,
      yellowColor,
      purplrColor,
      age1
    );

    System.out.printf(
      "| %s%-14s%s|  %s%d %3$s|",
      resetColor,
      name2,
      yellowColor,
      purplrColor,
      age2
    );

    System.out.printf("\n%s+", yellowColor);
    System.out.printf("-".repeat(15));
    System.out.print("+");
    System.out.print("-".repeat(5));
    System.out.printf("+ \n");
  }
}
