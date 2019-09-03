import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    Volatile.setA(i);
                    System.out.println("写入了：" + i);
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("读出了：" + Volatile.getA());
                }
            }
        }).start();
    }
}