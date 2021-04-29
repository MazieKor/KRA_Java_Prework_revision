package pl.coderslab.eparametrystartowe;

public class Main05 {

    public static void main(String[] args) {
        int points = Integer.parseInt(args[0]);
        if(points <0 || points>100){
            System.out.print("BADVALUE");
        } else if (points >= 91){
            System.out.print("A");
        } else if (points >= 71){
            System.out.print("C");
        } else if (points >= 51){
            System.out.print("E");
        } else {
            System.out.print("F");
        }



    }

}
