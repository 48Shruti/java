public class patterns {
    public static void main(String[] args) {
        // int n = 4;
        // int k = 5;
        // pattern 1 Solid rectangle
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= k; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // pattern 2 whole pattern
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= k; j++) {
        // if (i == 1 || j == 1 || i == n || j == k) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // half pyramid
        // int n = 4;
        // int k = 4;
        // for (int i = 0; i <= n; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // inverted half parameter
        int n = 1;
        for (int i = 4; i >= n; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
