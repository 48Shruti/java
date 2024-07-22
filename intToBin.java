
public class intToBin {
    public static void decimal(int n) {
        int[] arr = new int[4];
        for (int i = 0; i < arr.length - 1; i++) {
            if (n > 0) {
                arr[i] = n % 2;
                n = n / 2;
            }
            for (int j = i - 1; j > 0; j--) {
                System.out.println(arr[i]);
            }
        }

    }

    public static void main(String[] args) {
        // decimal(16);
        int num = 16;
        String bin = "1000";
        // decimal to binary
        System.out.println(Integer.toBinaryString(num));
        // binary to decimal
        System.out.println(Integer.parseInt(bin, 2));
    }
}
