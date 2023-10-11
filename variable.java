public class variable {
    public static void main(String[] args) {

        // permittive data type
        int a = 4;// size 4ṇ
        char c = 'a'; // size 2
        float f = 2.3838f;// size 4
        double d = 4.39394394d;// size 8
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        // non permittive data type
        String name = new String("hello");
        int[] marks = new int[3];
        marks[1] = 3;
        marks[2] = 4;
        System.out.println(name);
        System.out.println(marks);
    }
}
