package pl.coderslab.eparametrystartowe;

public class Main07 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int factorial = 1;
        if (n < 0)
            System.out.print("podaj liczbę większą od zera");
        else {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.print(factorial);
        }
    }

}
