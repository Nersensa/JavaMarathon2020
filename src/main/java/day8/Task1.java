package day8;

public class Task1 {
    public static void main(String[] args) {

        long time = System.currentTimeMillis();
        String stroka1 = new String();
        for (int i = 0; i <= 20000; i++) {
            stroka1 += " " + i;
        }
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        StringBuilder stroka2 = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            stroka2.append(" ").append(i);
        }
        System.out.println(System.currentTimeMillis() - time);
    }
}
