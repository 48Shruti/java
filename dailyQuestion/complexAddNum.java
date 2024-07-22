package dailyQuestion;

public class complexAddNum {
    int real;
    int imagine;

    complexAddNum(int r, int i) {
        this.real = r;
        this.imagine = i;
    }

    public void print() {
        System.out.println(this.real + "i" + this.imagine);
    }

}
