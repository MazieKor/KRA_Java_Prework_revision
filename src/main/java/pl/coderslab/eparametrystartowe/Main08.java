package pl.coderslab.eparametrystartowe;

public class Main08 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.print("podaj dokładnie 2 liczby");
        } else {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int max;
            int min;

            if (x > y) {
                max = x;
                min = y;
            } else {
                max = y;
                min = x;
            }
            int modulo;
            int gcd;
//            2 sposób:
//            for (int i = 0; i < 1000000; i++) {
//                if (max % min == 0) {
//                    gcd = min;
//                    System.out.print(gcd);
//                    break;
//                } else {
//                    modulo = max % min;
//                    max = min;
//                    min = modulo;
//                }
//            }

            while(max % min != 0) {
                modulo = max % min;
                max = min;
                min = modulo;
            }
            System.out.print(min);
        }

    }
}