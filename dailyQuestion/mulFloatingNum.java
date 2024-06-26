package dailyQuestion;

public class mulFloatingNum {
    public float floatMul(float num1, float num2) {
        float ans = 0.0f;
        ans = num1 * num2;
        return ans;
    }

    public static void main(String[] args) {
        // function call using object
        mulFloatingNum obj = new mulFloatingNum();
        System.out.println(obj.floatMul(9.8f, 3.2f)); // must use f after value
    }
}
