public class Singleton {
    private static class InstanceHolder {
        public static Emp instance = new Emp("张", 23);
    }

    public static Emp getInstance() {
        return InstanceHolder.instance; // 这里将导致InstanceHolder类被初始化
    }
}
