public class Demo3 {
    public static void main(String[] args) {
        int firstSet = 123;
        int secondSet = 456;
        int thirdSet = 7890;

        String redColor = "\033[031m";
        String resetColor = "\033[0m";

        System.out.printf("%s(%d)%s %d-%d \n",redColor,firstSet,resetColor,secondSet,thirdSet);
    }
    
}
