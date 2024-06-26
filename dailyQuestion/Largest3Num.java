package dailyQuestion;

public class Largest3Num {
    public int largest(int num1, int num2, int num3) {
        if (num1 > num2) {
            if (num1 > num3) {
                return num1;
            } else {
                return num3;
            }
        } else {
            if (num2 > num3) {
                return num2;
            } else {
                return num3;
            }
        }
    }

    public static void main(String[] args) {
        Largest3Num obj = new Largest3Num();
        System.out.println(obj.largest(89, 98, 100));
    }
}
