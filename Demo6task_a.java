public class Demo6task_a {
    public static void main(String[] args) {
        String redColor = "\033[041m";
        String greenColor = "\033[42m";
        String resetColor = "\033[0m";

        System.out.printf("%s[% 5d%s%-5s]%s \n",redColor,5,greenColor,"0%",resetColor);
    }
    
}
