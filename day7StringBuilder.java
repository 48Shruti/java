public class day7StringBuilder {
    public static void main(String[] args) {
        StringBuilder build = new StringBuilder("shruti");
        System.out.println(build);

        // character at index
        System.out.println(build.charAt(1));

        // set character at index
        build.setCharAt(0, 'S');
        System.out.println(build);

        // to insert character at index
        build.insert(5, 't');
        System.out.println(build);

        // delete index
        build.delete(5, 6);
        System.out.println(build);

        // append used for add char at last index of word
        // StringBuilder hello = new StringBuilder("h");
        // hello.append("e");
        // hello.append("l");
        // hello.append("l");
        // hello.append("o");
        // hello.insert(0, "H");
        // System.out.println(hello);
        // hello.setCharAt(0, 'H');
        // System.out.println(hello);

        // reverse string using stringhandler
        for (int i = 0; i < build.length() / 2; i++) {
            int front = i;
            int back = build.length() - 1 - i;
            char frontChar = build.charAt(front);
            char backChar = build.charAt(back);
            build.setCharAt(front, backChar);
            build.setCharAt(back, frontChar);
        }
        System.out.println(build);
    }
}
