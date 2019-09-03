import java.sql.SQLOutput;

public interface Eatable {
    default void eat() {
        System.out.println("eat");
    }
}
