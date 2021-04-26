package pl.coderslab.ckontrolaprzeplywu;

public class Main10 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < 2 * n; i++) {
            if (i < n) {
                for (int j = 0; j < n; j++) {
                    if (j <= i) {
                        System.out.print("* ");
                    } else {
                        System.out.print(j + 1 + " ");
                    }
                }
                System.out.println();
            } else {
                for (int j = 0; j < n; j++) {
                    if (2 * n - i > j)
                        System.out.print("* ");
                    else
                        System.out.print(j + 1 + " ");
                }
                if (i + 1 < 2 * n)
                    System.out.println();
                else
                    System.out.print("");
            }
        }
    }
}