public class Emp implements Cloneable {
    private String name;
    public int age;

    @Override
    public Emp clone() throws CloneNotSupportedException {
        return (Emp) super.clone();
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Emp() {
    }

    public Emp(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
