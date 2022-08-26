package Test1_26Aug2022;

public class Pattern {
    public static void main(String[] args) {
        pattern1();
    }

    public static void pattern1() {
        for(int i=1 ; i<=5;i++) {
            int spaces = 5-i;
            int stars = i;

            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=4 ; i>=0;i--) {

            int spaces = 5-i;
            int stars = i;

            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
