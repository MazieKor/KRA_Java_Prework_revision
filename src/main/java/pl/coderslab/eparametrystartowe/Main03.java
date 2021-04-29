package pl.coderslab.eparametrystartowe;

public class Main03 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            int argsInt = Integer.parseInt(args[i]);
            sum += argsInt;
        }
        double avg = sum / args.length;
        System.out.print(avg);
    }
}
