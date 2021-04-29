package pl.coderslab.eparametrystartowe;

public class Main04 {

    public static void main(String[] args) {
        if (Integer.parseInt(args[0]) + Integer.parseInt(args[1]) > Integer.parseInt(args[2]) &&
                Integer.parseInt(args[0]) + Integer.parseInt(args[2]) > Integer.parseInt(args[1]) &&
                Integer.parseInt(args[1]) + Integer.parseInt(args[2]) > Integer.parseInt(args[0])) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }

}
