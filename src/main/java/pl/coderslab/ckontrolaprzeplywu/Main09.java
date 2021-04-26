package pl.coderslab.ckontrolaprzeplywu;

public class Main09 {

    public static void main(String[] args) {
//        1. rozwiązanie
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
//        2. rozwiązanie
        for (int i = 0; i < n; i++) {
            String star = "";
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    star += "* ";
                }
            }
            if (i + 1 < n)
                System.out.println(star);
            else
                System.out.print(star);
        }
    }
}
