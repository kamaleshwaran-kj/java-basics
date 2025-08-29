// File: Main.java

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " Hello !");
        }

        ArrayList<String> a = new ArrayList<String>();

        a.add("Myilvaganan");
        a.add("Kamale");
        a.reversed();
        System.out.println(a.reversed());
        System.out.println(a.getClass().getName());

    }
}
