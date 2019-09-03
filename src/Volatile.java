public class Volatile {
    private static volatile int a = 0;

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Volatile.a = a;
    }
}
