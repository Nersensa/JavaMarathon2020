package day16;

public class Classssss {
    public static void main(String[] args) {
        String a = "123424";
        Object var1 =a.charAt(5);
        Object var2 = a.charAt(5)-'0';
        System.out.println(var1.getClass());
        System.out.println(var2.getClass());
        if (var1.getClass() == Integer.class) {
            System.out.println("var1 is an Integer");
        } else if (var1.getClass() == String.class) {
            System.out.println("var1 is a String");
        } else if (var1.getClass() == Double.class) {
            System.out.println("var1 is a Double");
        }

        if (var2.getClass() == Integer.class) {
            System.out.println("var2 is an Integer");
        } else if (var2.getClass() == String.class) {
            System.out.println("var2 is a String");
        } else if (var2.getClass() == Double.class) {
            System.out.println("var2 is a Double");
        }
    }
}
