public class patterns {
    public static void main(String[] args) {
        // pattern 1
        // int n = 4, m = 5;
        // for (int i = 0; i < m; i++) {
        // for (int j = 0; j < n; j++) {

        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // pattern 2
        int i, j;
        for (i = 0; i < 1; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int n = 1; n < 2; n++) {
            System.out.print("*");
        }
    }
}
