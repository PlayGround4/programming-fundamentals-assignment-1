public class Demo6task_c {
    public static void main(String[] args) {

        String yellowColor = "\033[033m";
        String resetBoldColor = "\033[;1m";
        String resetColor ="\033[0m";
        String greenColor = "\033[32m";
        String purpleColor = "\033[35m";

        String city1 = "Los Angeles";
        String city2_1 = "New";
        String city2_2 = "York";
        String state1 = "California";
        int pop1 = 3966936;
        int pop2 = 8336817;

        System.out.printf("%s+",yellowColor);
        System.out.print("-".repeat(15));
        System.out.print("+");
        System.out.print("-".repeat(12));
        System.out.print("+");
        System.out.print("-".repeat(12));  
                System.out.println("+");
 

        System.out.printf("| %s%-14s%s%s| %1$s%-11s%3$s%4$s| %1$s%-9s%3$s%4$s | \n",resetBoldColor,"CITY",resetColor,yellowColor,"STATE","POPULATION");

        System.out.printf("%s+",yellowColor);
        System.out.print("-".repeat(15));
        System.out.print("+");
        System.out.print("-".repeat(12));
        System.out.print("+");
        System.out.print("-".repeat(12));  
        System.out.println("+");

        System.out.printf("| %s%-14s%s| %1$s%-8s%3$s | %s%,-11d%3$s|\n",resetColor,city1,yellowColor,state1,purpleColor,pop1);

        System.out.printf("| %s%s%s %-10s%s| %1$s%2$s %3$s%4$-7s%5$s| %s%,-11d%5$s|\n",greenColor,city2_1,resetColor,city2_2,yellowColor,purpleColor,pop2);

        System.out.printf("%s+",yellowColor);
        System.out.print("-".repeat(15));
        System.out.print("+");
        System.out.print("-".repeat(12));
        System.out.print("+");
        System.out.print("-".repeat(12));  
        System.out.println("+");
        
    }
    
}
