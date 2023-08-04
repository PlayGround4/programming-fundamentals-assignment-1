public class Demo6task_d {

  public static void main(String[] args) {
    String resetBoldColor = "\033[;1m";
    String resetColor = "\033[0m";
    String greenColor = "\033[032m";
    String blueColor = "\033[034m";
    String purpleColor = "\033[035m";
    String yellowColor = "\033[033m";

    String item1 = "Apples";
    String item2 = "Oranges";
    int qty1 = 5;
    int qty2 = 10;
    float price1 = 0.99f;
    float price2 = 1.49f;

    System.out.printf("%s+", yellowColor);
    System.out.print("-".repeat(10));
    System.out.print("+");
    System.out.print("-".repeat(10));
    System.out.print("+");
    System.out.print("-".repeat(7));
    System.out.println("+");

    System.out.printf(
      "| %s%-9s%s%s| %1$s%-9s%3$s%4$s| %1$s%-6s%3$s%4$s| \n",
      resetBoldColor,
      "ITEM",
      resetColor,
      yellowColor,
      "QUANTITY",
      "PRICE"
    );

    System.out.printf("%s+%s", yellowColor, greenColor);
    System.out.print("-".repeat(10));
    System.out.printf("%s+", yellowColor);
    System.out.print("-".repeat(10));
    System.out.printf("+%s", greenColor);
    System.out.print("-".repeat(7));
    System.out.printf("%s+\n", yellowColor);

    System.out.printf(
      "| %s%-9s%s| %s%8d%3$s | %s$%s%.2f%3$s |\n",
      resetColor,
      item1,
      yellowColor,
      blueColor,
      qty1,
      greenColor,
      purpleColor,
      price1
    );

    System.out.printf(
      "| %s%-9s%s| %s%8d%3$s | %s$%s%.2f%3$s |\n",
      resetColor,
      item2,
      yellowColor,
      blueColor,
      qty2,
      greenColor,
      purpleColor,
      price2
    );

    System.out.printf("%s+%s", yellowColor, greenColor);
    System.out.print("-".repeat(10));
    System.out.printf("%s+", yellowColor);
    System.out.print("-".repeat(10));
    System.out.printf("+%s", greenColor);
    System.out.print("-".repeat(7));
    System.out.printf("%s+\n", yellowColor);
  }
}
